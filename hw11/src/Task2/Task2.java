package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("src/task2/in1.txt");
        File file2 = new File("src/task2//in2.txt");

        Scanner sc1 = new Scanner(file1);
        Scanner sc2 = new Scanner(file2);

        PrintWriter pw = new PrintWriter("src/task2/out.txt");

        int a = sc1.nextInt();
        int b = sc2.nextInt();

        while   (sc1.hasNextInt()
                || sc2.hasNextInt())
        {
            if (a < b)
            {
                pw.println(a);
                if (sc1.hasNextInt()) a = sc1.nextInt();
                else a = sc2.nextInt();
            } else
                {
                pw.println(b);
                if (sc2.hasNextInt()) b = sc2.nextInt();
                else b = sc1.nextInt();
            }
        }

        if (a < b)
        {
            pw.println(a);
            pw.println(b);
        } else
            {
            pw.println(b);
            pw.println(a);
        }
        pw.close();
    }
}
