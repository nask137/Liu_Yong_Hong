package project6;

public class IllegalArgumentException extends Exception {

    public IllegalArgumentException() {
    }


    public  void  cuo(int a, int b, int c){
        System.out.println(a +","+b+","+c+"三条边不能构成三角形！\n");
System.exit(-1);
    }

    public String toString() {
        return "IllegalArgumentException{}";
    }
}
