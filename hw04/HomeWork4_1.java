import java.util.Scanner;

public class HomeWork4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int a = 0;
        int c = b -1;
        int[] arr1 = new int[b];
        for (int i = 0; i < b; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
           int k = i - a;
           if(arr[i] == arr1[a]) {
               if (a == 1) {
                   System.out.println(k);
                   break;
               }
               a++;
           }
        }
    }
}


