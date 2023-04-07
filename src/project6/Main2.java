package project6;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int []test =new int[4];
        System.out.println("请输入四个数字");
        Scanner sc = new Scanner(System.in);
        try {
            try {
                for (int i = 0; i <4 ; i++) {
                    test[i]=Integer.parseInt(sc.next());
                }
            for (int i=0;i<5;i++) {
                System.out.println(test[i]);
            }

        } catch (NumberFormatException e) {
            System.out.println("需要输入数字");
        }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("遍历次数过多");
        }finally {
            System.out.println("请重新运行此程序");
        }
    }
}
