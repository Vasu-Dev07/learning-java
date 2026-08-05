import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the temperature Calculater");

        System.out.println("Enter your temp in F: ");
        double F = input.nextDouble();

        System.out.println("Your temp in C: " + ((F - 32 ) * 5/9));
    }
}
