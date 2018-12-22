import java.util.Scanner;
public class HomeWork6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String spc = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' '){
                spc += c;
            }
        }
        System.out.println(spc);
    }
}
