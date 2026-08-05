import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter the First Number: ");
        int num1 = input.nextInt();
        System.out.print("Please Enter the Second Number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of the Numbers is: " + sum);

        int minus = num1 - num2;
        System.out.println("Minus of the Numbers is: " + minus);

        int product = num1 * num2;
        System.out.println("Product of the Numbers is: " + product);

        int divison = num1 / num2;
        System.out.println("Divison of the Numbers is: " + divison);

        int modulus = num1 % num2;
        System.out.println("Remainder of the Numbers is: " + modulus);
    }
}
