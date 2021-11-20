import java.io.*;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {

        File file = new File("poetry.txt");

        Scanner scan = new Scanner(file);

        System.out.println(scan.nextLine());
        
    }
}