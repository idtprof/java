import java.util.Scanner;  // Import the Scanner class

public class CookieCalc {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Enter number of cookies eaten: ");

    int cookiesEaten = scan.nextInt();  // Read user input, number of cookiss
    System.out.print("Your calorie intake was: ");
    System.out.print(cookiesEaten * 75);  // Output result
  }
}

