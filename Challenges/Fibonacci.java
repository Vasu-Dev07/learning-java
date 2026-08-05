import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Plese enter your number: ");
        int num = input.nextInt();

        System.out.println("Fibonacci series is ");
        series(num);
        
    }

    public static void series( int num) {
        int a = 0;
        int b = 1;
        System.out.print(" 0 , 1 ,");
        int sum = 0;
        while ( num > 1) {
            sum = a + b;
            System.out.print(" " + sum + ",");
            a = b;
            b = sum;
            num--;
        }
   
    }

}
