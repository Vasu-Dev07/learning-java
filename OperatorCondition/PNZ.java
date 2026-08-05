import java.util.Scanner;

public class PNZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to number Identifier..");
        System.out.print("Please enter your number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.print("The given number is positive..");
        }else if (number < 0) {
            System.out.println("The number is Negative..");
        }else {
            System.out.println("The given number is ZERO");
        }
    }
}
