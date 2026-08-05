import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Your number is Armstrong");
        }else{
            System.out.println("Your number is Not Armstrong");
        }
    }

    public static boolean isArmstrong(int num) {
        int noOfdigits = noofdigits(num);
        int finalnumber = 0;
        int copynum = num;
        while (num > 0){
            int lastdigit = num % 10;
            num /= 10;
            finalnumber += pow(lastdigit, noOfdigits);
        }
        return finalnumber == copynum;
    }

    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while (i < num2){
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noofdigits(int num){
        int digits = 0;
        while (num > 0) {
            digits++;
            num /=10;
        }
        return digits;
    }
}
