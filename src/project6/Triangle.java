package project6;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) throws IllegalArgumentException {
        if(  a+b<=c||a+c<=b||b+c<=a ) {
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("此三遍可以构成三角形！");
    }

    /**
     * 获取
     * @return a
     */
    public int getA() {
        return a;
    }

    /**
     * 设置
     * @param a
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * 获取
     * @return b
     */
    public int getB() {
        return b;
    }

    /**
     * 设置
     * @param b
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * 获取
     * @return c
     */
    public int getC() {
        return c;
    }

    /**
     * 设置
     * @param c
     */
    public void setC(int c) {
        this.c = c;
    }

    public String toString() {
        return "Triangle{a = " + a + ", b = " + b + ", c = " + c + "}";
    }
}
