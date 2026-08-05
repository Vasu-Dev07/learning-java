import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
        System.out.print("Please enter your First number: ");
        int num1 = add.nextInt();
        System.out.print("Now please enter the Second Number: ");
        int num2 = add.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }
}
