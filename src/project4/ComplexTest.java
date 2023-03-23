package project4;
public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 0);
        Complex c2 = new Complex(3, 2);
        c1.showComp();
        c2.showComp();
        Complex.addComp(c1,c2).showComp();
        Complex.multiComp(c1,c2).showComp();
        System.out.println(Complex.equalComp(c1, c2));
    }
}
