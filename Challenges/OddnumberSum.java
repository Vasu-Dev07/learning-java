import java.util.Scanner;

public class OddnumberSum {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please Enter your number:");
    int num = input.nextInt();

   
    System.out.println("Sum of all odd Numbers will be: " +  Sum(num));
    System.out.print("Sum of all odd Numbers will be: " +  another(num));
}   


    public static int Sum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++){
            if (i % 2 != 0) {
                sum = sum + i;
            }

            // for (int i = 1; i <= num; i += 2){
            // sum += i;

        }
        return sum;
    }

    public static int another(int num){
        int sum = 0;
        int i = 1;
        while (i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }
}
