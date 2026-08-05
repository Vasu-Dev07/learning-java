import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your number:");
        int a = input.nextInt();

        boolean isPrime = isPrime(a);
        if (isPrime) {
            System.out.println("Your number is prime");
        }else {
            System.out.println("Your number is not prime");
        }
    }

    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if ( num % i == 0 ) {
                return false;
            }
            i++;
        }   
        return true;
    }
}
