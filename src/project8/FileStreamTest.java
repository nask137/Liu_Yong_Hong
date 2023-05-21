package project8;
import java.io.*;
public class FileStreamTest {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("请输入要写入文件的字符串：");
            String str = br.readLine(); // 读取键盘输入的字符串

            FileOutputStream fos = new FileOutputStream("src/project8/test.txt",true); // 创建文件输出流，将字符串写入文件
            fos.write(str.getBytes());
            fos.close();

            FileInputStream fis = new FileInputStream("src/project8/test.txt"); // 创建文件输入流，读取文件内容
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, length)); // 将读取到的内容显示在控制台上
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}