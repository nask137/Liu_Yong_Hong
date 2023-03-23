package project4;

public class Point {
    private double X;
    private double Y;


    public Point() {
    }

    public Point(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    /**
     * 获取
     * @return X
     */
    public double getX() {
        return X;
    }

    /**
     * 设置
     * @param X
     */
    public void setX(int X) {
        this.X = X;
    }

    /**
     * 获取
     * @return Y
     */
    public double getY() {
        return Y;
    }

    /**
     * 设置
     * @param Y
     */
    public void setY(int Y) {
        this.Y = Y;
    }

    public String toString() {
        return "Point{X = " + X + ", Y = " + Y + "}";
    }
    public void show(){
        System.out.println("("+this.X+","+this.Y+")");
    }
}
