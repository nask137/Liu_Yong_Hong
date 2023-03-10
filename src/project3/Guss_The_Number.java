package project3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Guss_The_Number {
    public static void main(String[] args) {
        int[]a=new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


        Random random = new Random(System.currentTimeMillis()%3);
        int i = random.nextInt(1000000);
        int number= i%100;
        System.out.println("数字准备好了！！\n请输入1-100 你所猜的数字\n");
        Scanner sc = new Scanner(System.in);
        int guss=-1;
        while(guss!=number){
             guss=sc.nextInt();
             if(guss<number) System.out.println("猜小了!继续猜\n");
             if(guss>number) System.out.println("猜大了！继续猜\n");
        }
        System.out.println("猜对了");
    }
}
