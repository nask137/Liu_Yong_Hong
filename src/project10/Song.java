package project10;

import java.io.Serializable;

public class Song implements Serializable {
    private int id;
    private String name;
    private String language;
    private String category;
    private String singer;

    public Song(int id, String name, String language, String category, String singer) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.category = category;
        this.singer = singer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public String getCategory() {
        return category;
    }

    public String getSinger() {
        return singer;
    }

    @Override
    public String toString() {
        return "编号：" + id + "，歌曲名：" + name + "，语言：" + language + "，类别：" + category + "，歌手：" + singer;
    }
}
