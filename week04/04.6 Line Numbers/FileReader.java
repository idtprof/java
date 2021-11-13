import java.io.*;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws IOException {

        String filename = "poetry.txt";
        int lineCount = 1;

        File file = new File(filename);

        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            System.out.println(lineCount + ": " + scan.nextLine());
            lineCount++;
        }

    }
}