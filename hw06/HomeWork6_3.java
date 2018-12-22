import java.util.Scanner;

public class HomeWork6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] arr = new int[q];
        int e = 0;
        int w = 0;
        for (int i = 0; i < q; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < q - 1; i++) {
            if(arr[i] == arr[i + 1]) e++;
            else e = 0;
            if(e > w){
                w = e;
            }
        }
        w = w + 1;
        System.out.println(w);
    }
}
