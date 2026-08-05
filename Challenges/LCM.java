//Least Common Multiple

import java.util.Scanner;

public class LCM {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your 1st number:");
        int a = input.nextInt();
        System.out.print("Please Enter your 2nd number:");
        int b = input.nextInt();

        int num1 = Math.min(a, b);
        int num2 = Math.max(a, b);
        System.out.println("LCM of given number is: " + calculation(num1, num2));
        System.out.println("LCM of given number is: " + another(num1, num2));


    }

    public static int calculation(int a, int b){
        int num = 1;

        while (true) {
            if (num % a == 0 && num %  b == 0) {
                return num;
            }
            num++;
        }
    }

    public static int another(int a, int b){
        int i = 1;
        while (i <= b) {
            int factor = a * i;
            if (factor % b == 0 ) {
                return factor;
            }
            i++;
        }
        return 0;
    }

    
}
