package project3;
import java.util.Scanner;
import java.util.Arrays;
public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a=new int[10];
        for (int i = 0; i <10 ; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("max:="+Arrays.stream(a).max().getAsInt());
        System.out.println("min=:"+Arrays.stream(a).min().getAsInt());
        System.out.println("sum=:"+Arrays.stream(a).sum());
        System.out.println("avg=:"+(double)Arrays.stream(a).sum()/a.length);

    }
}