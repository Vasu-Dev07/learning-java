import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 1; j--) {

                if (j > i)
                    System.out.print("  ");
                else 
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
