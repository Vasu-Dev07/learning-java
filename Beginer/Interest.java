import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter the Principle Amount: ");
        int P = input.nextInt();

        System.out.print("Please Enter the Rate of Interest: ");
        float R = input.nextFloat();

        System.out.print("Please Enter the Time: ");
        int T = input.nextInt();

        System.out.println("Simple Interest will be: "+ ((P * R * T)/100));

        double compInt = P * Math.pow((1+ R / 100), T);

        System.out.println("Compound Interest will be: " + compInt);
    }
}
