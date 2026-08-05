import java.util.Scanner;

public class Shift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your Number: ");
        int num = input.nextInt();

        System.out.println((num << 4) + " Left Shift with 1 ");
        System.out.println((num >> 1) + " Right Shift with 1");

    }
}
