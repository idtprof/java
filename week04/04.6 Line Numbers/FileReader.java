import java.io.*;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws IOException {

        String filename;
        int lineCount = 1;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        filename = keyboard.nextLine();

        File file = new File(filename);

        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            System.out.println(lineCount + ": " + scan.nextLine());
            lineCount++;
        }

    }
}