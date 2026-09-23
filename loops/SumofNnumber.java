import java.util.Scanner;

public class SumofNnumber {
    public static void main(String[] args) {
        Scanner poka = new Scanner(System.in);

        System.out.println("Please enter your number: ");
        int num = poka.nextInt();

        int sum = 0;
        for (int i = 0; i <= num; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}