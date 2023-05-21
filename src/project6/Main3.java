package project6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main3 {
    public static void main(String[] args) throws IllegalArgumentException {
        int a;
        int b;
        int c;
        System.out.println("请输入三角形的三条边 （中间用空格隔开）");
        try {
            a = NextInt();
            b = NextInt();
            c = NextInt();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Triangle t = new Triangle(a,b,c);
        } catch (IllegalArgumentException e) {
            e.cuo(a,b,c);
        }
    }
   public static StreamTokenizer  s=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static  int  NextInt() throws IOException {
        s.nextToken();
        return (int )s.nval;

    }
}
