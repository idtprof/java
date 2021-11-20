import java.security.spec.ECPoint;

public class Methods {

    public static void main(String[] args) {

        welcome();

        multiply(5, 15);
        multiply(4, 83);
        multiply(7, 3);

        divide(20, 5);

    }

    public static void divide (int a, int b) {

        // define a dividing method
        System.out.println(a / b);
    }

    public static void multiply (int a, int b) {

        // define a multiplying method
        System.out.println(a * b);

    }

    public static void welcome () {

        // display a message
        System.out.println("Welcome to this cheap calculator!");

    }

}
