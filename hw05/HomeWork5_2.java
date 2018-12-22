import java.util.Scanner;

public class HomeWork5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String string = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'o' | c == '1' | c == '2' | c == '3' | c == '4' | c == '5' | c == '6' | c == '7' | c == '8' | c == '9') {
                c = '*';
            }
            else if (c == ' ' ){
                c = ' ';
            }
            string += c;
        }
        System.out.println(string);
    }
}
