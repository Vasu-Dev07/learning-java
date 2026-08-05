import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter your first Number: ");
        int first = input.nextInt();
        System.out.println( (~first) + " Not/Compliment Operator");

        System.out.print("Please Enter your Second Number: ");
        int second = input.nextInt();

        System.out.println((first & second) + " And Operator");
        System.out.println((first | second) + " OR Operator");
        System.out.println((first ^ second) + " XOR Operator");

    } 
}