import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your First number: ");
        int num1 = input.nextInt();

        System.out.print("Now,Please enter Second number: ");
        int num2 = input.nextInt();

        System.out.print("Now, Enter the third number: ");
        int num3 = input.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All Numbers are Equal..");
        }else if (num1>num2 && num1>num3) {
            System.out.println( num1 + " is the greatest");
        }else if (num2>num3 && num2>num1) {
            System.out.println(num2 + " is the greatest");
        }else {
            System.out.println(num3 +" is the Greatest");
        }

    }
}
