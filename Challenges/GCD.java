import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your 1st number:");
        int a = input.nextInt();
        System.out.print("Please Enter your 2nd number:");
        int b = input.nextInt();

        int num1 = Math.min(a, b);
        int num2 = Math.max(a, b);
        System.out.println("GCD of given number is: " + gcd(num1, num2));
    }

    public static int gcd(int a, int b) {
        int least = Least(a , b);
        while (least > 0){
            if (a % least == 0 && b % least == 0){
                return least;
            }
            least--;
        }
        return least;
    }

    public static int Least(int a, int b ) {
        if (a > b ) {
            return b;
        }else{
            return a;
        }
    }
}
