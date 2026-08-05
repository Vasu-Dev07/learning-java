import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your Number: ");
        float num = input.nextFloat();

        if ( num % 2 == 0) {
            System.out.println("The given Number is EVEN..");
        }else{
            System.out.println("The Given Number is ODD..");
        }
    }
    
}
