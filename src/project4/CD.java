package project4;

import java.util.Arrays;

public class CD {
    private int size;
    private double []content;

    public CD() {
    }

    public CD(int size, double [] content) {
        this.size = size;
        this.content = content;
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

    /**
     * 获取
     *
     * @return content
     */
    public double[] getContent() {
        return content;
    }

    /**
     * 设置
     * @param content
     */
    public void setContent(double[] content) {
        this.content = content;
    }

    public String toString() {
        return "CD{size = " + size + ", content = " + Arrays.toString(content) + "}";
    }
}
