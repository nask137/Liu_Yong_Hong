package project4;

public class Computer {
    private int date;
private CD cd;

    public Computer() {
    }

    public Computer(int date, CD cd) {
        this.date = date;
        this.cd = cd;
    }

    /**
     * 获取
     * @return date
     */
    public int getDate() {
        return date;
    }

    /**
     * 设置
     * @param date
     */
    public void setDate(int date) {
        this.date = date;
    }

    /**
     * 获取
     * @return cd
     */
    public CD getCd() {
        return cd;
    }

    /**
     * 设置
     * @param cd
     */
    public void setCd(CD cd) {
        this.cd = cd;
    }

    public String toString() {
        return "Computer{date = " + date + ", cd = " + cd + "}";
    }
}
