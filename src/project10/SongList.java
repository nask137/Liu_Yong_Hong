package project10;
import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class SongList {

    private List<Song> songs;
    private Map<Integer, Song> songMap;
    private File file;

    public SongList(String filename) {
        try {
            file = new File(filename);
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(file.toPath()));
            songs = (List<Song>) ois.readObject();
            songMap = (Map<Integer, Song>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            songs = new ArrayList<>();
            songMap = new HashMap<>();
        }
    }

    public void save() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(songs);
            oos.writeObject(songMap);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addSong(Song song) {
        songs.add(song);
        songMap.put(song.getId(), song);
        save();
    }

    public void removeSong(int id) {
        Song song = songMap.get(id);
        if (song != null) {
            songs.remove(song);
            songMap.remove(id);
            save();
        }
    }

    public List<Song> searchByName(String name) {
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getName().contains(name)) {
                result.add(song);
            }
        }
        return result;
    }

    public List<Song> searchByLanguage(String language) {
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getLanguage().equals(language)) {
                result.add(song);
            }
        }
        return result;
    }

    public List<Song> searchByCategory(String category) {
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getCategory().equals(category)) {
                result.add(song);
            }
        }
        return result;
    }

    public List<Song> searchBySinger(String singer) {
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getSinger().contains(singer)) {
                result.add(song);
            }
        }
        return result;
    }

    public List<Song> getAllSongs() {
        return songs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SongList songList = new SongList("src//project10//songs.txt");
        while (true) {
            System.out.println("*************************歌曲管理系统**************************");
            System.out.println("1. 查找歌曲 2. 增加歌曲 3. 删除歌曲 4. 查询所有歌曲信息 5. 退出");
            System.out.println("***************************************************************");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (option) {
                case 1:
                    System.out.println("请输入查找关键字：");
                    String keyword = scanner.nextLine();
                    List<Song> songs = songList.searchByName(keyword);
                    songs.addAll(songList.searchByLanguage(keyword));
                    songs.addAll(songList.searchByCategory(keyword));
                    songs.addAll(songList.searchBySinger(keyword));
                    if (songs.isEmpty()) {
                        System.out.println("没有找到相关歌曲。");
                    } else {
                        for (Song song : songs) {
                            System.out.println(song);
                        }
                    }
                    break;
                case 2:
                    System.out.println("请输入歌曲信息（编号、歌名、语言、类别、歌手，以逗号分隔）：");
                    String line = scanner.nextLine();
                    String[] fields = line.split(",");
                    if (fields.length != 5) {
                        System.out.println("输入格式不正确。");
                    } else {
                        try {
                            int id = Integer.parseInt(fields[0].trim());
                            String name = fields[1].trim();
                            String language = fields[2].trim();
                            String category = fields[3].trim();
                            String singer = fields[4].trim();
                            Song song = new Song(id, name, language, category, singer);
                            songList.addSong(song);
                            System.out.println("已添加歌曲：" + song);
                        } catch (NumberFormatException e) {
                            System.out.println("编号必须是整数。");
                        }
                    }
                    break;
                case 3:
                    System.out.println("请输入歌曲编号：");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    songList.removeSong(id);
                    System.out.println("已删除歌曲。");
                    break;
                case 4:
                    List<Song> allSongs = songList.getAllSongs();
                    if (allSongs.isEmpty()) {
                        System.out.println("目前没有任何歌曲信息。");
                    } else {
                        for (Song song : allSongs) {
                            System.out.println(song);
                        }
                    }
                    break;
                case 5:
                    songList.save();
                    return;
                default:
                    System.out.println("无效选项。");
            }
        }
    }

}
