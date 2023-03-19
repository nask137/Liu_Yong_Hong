package project3;
import java.util.HashMap;
import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                Integer in = map.get(c);
                in++;
                map.put(c,in);
            }

        }
        map.forEach(( character, integer)-> System.out.print("'"+character+"'："+integer+"    "));
        scanner.close();

    }
}
