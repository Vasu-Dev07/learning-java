import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Entter your number:");
        int num = input.nextInt();
        int sum = SumofDigit(num);
        System.out.println("Sum of all Digits of the integer is " + sum);


    }

    public static int SumofDigit(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
        
    }
}
