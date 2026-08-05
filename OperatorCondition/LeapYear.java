import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter Your Year: ");
        int Year = input.nextInt();
        
        if ((Year % 4 == 0 && Year % 100 != 0) || Year % 400 == 0  ) {
            System.out.println("Your Year is Leap Year");
        }else{
            System.out.println("Your Year is Not A Leap Year");
        
        }
    }
}
