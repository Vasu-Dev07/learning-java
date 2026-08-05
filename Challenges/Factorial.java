import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your number: ");
    int num = input.nextInt();

    System.out.print("Factorial of Number will be: " +  Factorial(num));


}    

public static long Factorial(int num) {
    if (num < 2) {
        return 1;
    }
    long var = 1;
    for(int i = num; i >= 1; i--) {
        var *= i;
    }
    return var;
}
}
