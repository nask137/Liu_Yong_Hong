package project6;

public class Goods {
    boolean isDanger;
    String name;

    public Goods() {
    }

    public Goods(boolean isDanger, String name) {
        this.isDanger = isDanger;
        this.name = name;
    }

    /**
     * 获取
     * @return isDanger
     */
    public boolean isIsDanger() {
        return isDanger;
    }

    /**
     * 设置
     * @param isDanger
     */
    public void setIsDanger(boolean isDanger) {
        this.isDanger = isDanger;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Goods{isDanger = " + isDanger + ", name = " + name + "}";
    }
    public boolean isDanger() {
        return isDanger;
    }
}
