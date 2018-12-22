package task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    private static int chars = 26;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/task1/in.txt");
        Scanner scanner = new Scanner(file);

        int count = 0;
        int maxlength = maxLength(scanner);
        while (count < maxlength)
        {
            splt(count);
            together();
            count++;
        }
    }

    public static void together() throws FileNotFoundException {
        File file = new File("src/task1/in.txt");
        Scanner[] scanners = new Scanner[chars];
        PrintWriter printWriter = new PrintWriter(file);

        for (int i = 0; i < chars; i++)
        {
            scanners[i] = new Scanner(new File("src/task1/letters/letter" + i + ".txt"));
        }

        for (int i = 0; i < chars; i++)
        {
            while (scanners[i].hasNext())
            {
                printWriter.println(scanners[i].next());
            }
        }
        printWriter.flush();
    }

    public static void splt(int count) throws FileNotFoundException {
        File file = new File("src/task1/in.txt");
        Scanner scanner = new Scanner(file);
        PrintWriter[] printWriters = new PrintWriter[chars];

        for (int i = 0; i < chars; i++)
        {
            printWriters[i] = new PrintWriter("src/task1/letters/letter" + i + ".txt");
        }

        while (scanner.hasNext())
        {
            String string = scanner.next();
            char letter = (string.length() - 1 > count) ? string.charAt(string.length() - count - 1) : string.charAt(0);
            int index = (int) letter - 97;

            printWriters[index].println(string);
            printWriters[index].flush();
        }
    }

    public static int maxLength(Scanner scanner) {
        int maxLength = 0;
        while (scanner.hasNext())
        {
            int length = scanner.next().length();
            if (length > maxLength) maxLength = length;
        }
        return maxLength;
    }
}