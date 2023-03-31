package project5;

public class Rectangle2 implements DiagArea{
    private  double c;
    private  double k;

    public Rectangle2() {
    }

    public Rectangle2(double c, double k) {
        this.c = c;
        this.k = k;
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(this.k,2)+Math.pow(this.c,2));
    }
    public void show(){
        System.out.println("长为："+this.c+"宽为："+this.k+"面积为："+this.getArea()+"对角线长度为："+this.getDiagonal());
    }
    @Override
    public double getArea() {
        return this.c*this.k;
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
        return "Rectangle2{c = " + c + ", k = " + k + "}";
    }
}
