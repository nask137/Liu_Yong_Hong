package project8;
import java.io.*;

public class LineNumberTest {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src//project8//test2.txt")); // 建立文件输入流，读取原始文件内容
            BufferedWriter writer = new BufferedWriter(new FileWriter("src//project8//result.txt")); // 建立文件输出流，将带行号的内容写入文件

            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                String numberedLine = lineNumber + "." + line + "\n"; // 给每行内容加上行号和换行符
                writer.write(numberedLine); // 写入带行号的内容到输出文件中
                lineNumber++;
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

