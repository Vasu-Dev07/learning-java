import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Entter your number:");
        int num = input.nextInt();


        int newnum = reverse(num);
        if (newnum == num) {
            System.out.println("Your number is palindrome");
        }else {
            System.out.println("Your number is not Palindrome.. ");
        }

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