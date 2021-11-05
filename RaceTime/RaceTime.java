import java.util.Scanner;

public class RaceTime {
  public static void main(String[] args) {
    
    // runner1 info
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter name and time:");
    // String input
    String runner1 = scan.nextLine();
    // Numerical input
    int time1 = scan.nextInt();

    // runner2 info
    Scanner scan2 = new Scanner(System.in);
    System.out.println("Enter name and time:");
    // String input
    String runner2 = scan2.nextLine();
    // Numerical input
    int time2 = scan2.nextInt();

    // runner3 info
    Scanner scan3 = new Scanner(System.in);
    System.out.println("Enter name and time:");
    // String input
    String runner3 = scan3.nextLine();
    // Numerical input
    int time3 = scan3.nextInt();
    
    
    // Output input by user
    System.out.println("Runner: " + runner1);
    System.out.println("Time: " + time1);
    System.out.println("Runner: " + runner2);
    System.out.println("Time: " + time2);
    System.out.println("Runner: " + runner3);
    System.out.println("Time: " + time3);

    if (time1 >= time2) {
      if (time2 >= time3)
          System.out.print("In order " + runner3 + " " + runner2 + " " + runner1);
      else if (time3 >= time1)
          System.out.print("In order " + runner2 + " " + runner1 + " " + runner3);
      else if (time1 >= time3)
          System.out.print("In order " + runner2 + " " + runner3 + " " + runner1);
  } else {
      if (time3 >= time2)
          System.out.print("In order " + runner1 + " " + runner2 + " " + runner3);
      else if (time3 >= time1)
          System.out.print("In order " + runner1 + " " + runner3 + " " + runner2);
      else if (time1 >= time3)
          System.out.print("In order " + runner3 + " " + runner1 + " " + runner2);
  }

  }
}