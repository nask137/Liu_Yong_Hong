package project5;

public class Circle extends Shape {
    private double r;
    public static final double PAI=3.14149;
    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    /**
     * 获取
     * @return r
     */
    public double getR() {
        return r;
    }

    /**
     * 设置
     * @param r
     */
    public void setR(double r) {
        this.r = r;
    }

    public String toString() {
        return "Circle{r = " + r + "}";
    }

    @Override
    public void showArea() {
        System.out.println("圆的面积是："+PAI*this.r*this.r);
    }
}
