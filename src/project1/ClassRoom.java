package project1;

public class ClassRoom {
    private int id;
    private int size;

    public ClassRoom() {
    }

    public ClassRoom(int id, int size) {
        this.id = id;
        this.size = size;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * 设置
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    public String toString() {
        return "ClassRoom{id = " + id + ", size = " + size + "}";
    }
}
