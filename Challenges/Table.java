import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Entter your number:");
        int num = input.nextInt();
        multiplier(num);   
    }

    public static void multiplier(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println( num + "X" + i + "=" + (i * num));
        }
    }
}
