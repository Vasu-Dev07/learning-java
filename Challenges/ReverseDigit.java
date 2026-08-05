import java.util.Scanner;

public class ReverseDigit {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Entter your number:");
        int num = input.nextInt();
        System.out.println("Sum of all Digits of the integer is " + reverse(num));


    }

    public static int reverse(int num){
        int newnum = 0;
        while (num > 0){
            int digit = num % 10;
            newnum = newnum * 10 + digit;
            num /= 10;
        }
        return newnum;
        
    }
}
