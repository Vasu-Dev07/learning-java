import java.util.Scanner;

public class Swap2num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter Your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter the Second Number: ");
        int num2 = input.nextInt();

        System.out.println("Before Swaping First Number is: "  + num1 + "\tSecond Number is : " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swaping First Number is: "  + num1 + "\tSecond Number is : " + num2);


    }
}
