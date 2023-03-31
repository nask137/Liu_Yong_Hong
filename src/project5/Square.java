package project5;

public class Square extends Shape{
    private double b;

    public Square() {
    }

    public Square(double b) {
        this.b = b;
    }

    @Override
    public void showArea() {
        System.out.println("正方形的面积为："+ this.b*this.b);
    }

    /**
     * 获取
     * @return b
     */
    public double getB() {
        return b;
    }

    /**
     * 设置
     * @param b
     */
    public void setB(double b) {
        this.b = b;
    }

    public String toString() {
        return "Square{b = " + b + "}";
    }
}
