package project5;

public class Sqare2 extends Rectangle2{
    private double b;

    @Override
    public double getArea() {
        return Math.pow(this.b,2);
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(2)*this.b;
    }

    @Override
    public void show() {
        System.out.println("边长为："+this.b+"面积为："+this.getArea()+"对角线长度为："+this.getDiagonal());
    }

    public Sqare2() {
    }

    public Sqare2(double b) {
        this.b = b;
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
        return "Sqare2{b = " + b + "}";
    }
}
