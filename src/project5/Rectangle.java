package project5;

public class Rectangle extends Shape{
    private double c;
    private double k;

    public Rectangle() {
    }

    public Rectangle(double c, double k) {
        this.c = c;
        this.k = k;
    }

    @Override
    public void showArea( ) {
        System.out.println("矩形的面积为："+this.c*this.k);

    }

    /**
     * 获取
     * @return c
     */
    public double getC() {
        return c;
    }

    /**
     * 设置
     * @param c
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * 获取
     * @return k
     */
    public double getK() {
        return k;
    }

    /**
     * 设置
     * @param k
     */
    public void setK(double k) {
        this.k = k;
    }

    public String toString() {
        return "Rectangle{c = " + c + ", k = " + k + "}";
    }
}
