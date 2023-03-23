package project4;

public class Complex {
    private  int i;
    private  int j;

    public void showComp(){
        if (j!=0) {
            System.out.println(this.i+"+"+this.j+"i");
        }else {
            System.out.println(this.i);
        }
    }
    public static Complex addComp(Complex C1,Complex C2){
        return new Complex(C1.i+C2.i,C1.j+C2.j);
    }
    public static Complex subComp(Complex C1,Complex C2){

        return new Complex(C1.i-C2.i,C1.j-C2.j);
    }
    public static Complex multiComp(Complex C1,Complex C2){
        return  new Complex(C1.i*C2.i-C1.j*C2.j,C1.i*C2.j+C1.j*C2.i);
    }
    public static boolean equalComp(Complex C1,Complex C2){
        if(C1.i==C2.i&&C1.j==C2.j)return true;
        return false;
    }
    public Complex() {
    }

    public Complex(int i, int j) {
        this.i = i;
        this.j = j;
    }

    /**
     * 获取
     * @return i
     */
    public double getI() {
        return i;
    }

    /**
     * 设置
     * @param i
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * 获取
     * @return j
     */
    public double getJ() {
        return j;
    }

    /**
     * 设置
     * @param j
     */
    public void setJ(int j) {
        this.j = j;
    }

    public String toString() {
        return "Complex{i = " + i + ", j = " + j + "}";
    }
}
