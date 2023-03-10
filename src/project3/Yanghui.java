package project3;

public class Yanghui {
    public static void main(String[] args) {
        int[][] a=new int[10][10];
        a[0][0]=1;a[1][0]=1;a[1][1]=1;
        for (int i = 2; i <10 ; i++) {
            for (int j = 0; j < 1+i; j++) {
                if(j==0||j==i)a[i][j]=1;
                else a[i][j]=a[i-1][j-1]+a[i-1][j];
            }  
        }
        for (int i = 0; i <10 ; i++){
            for (int j = 0; j < i+1; j++) {
                System.out.print(a[i][j]+" ");
            }
        System.out.println("");}
    }
}
