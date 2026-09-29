import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int numbers[] = new int[size];

        for(int i = 0; i<size; i++){
            numbers[i] = input.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }
}
