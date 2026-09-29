import java.util.Scanner;

public class SearchingX {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of the array");
        int size = input.nextInt();

        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = input.nextInt();
        }

        int x = input.nextInt();

        for(int i=0; i <numbers.length; i++){
            if(numbers[i] == x)
            System.out.println(i);
        else
            System.out.println("poka");
        }
    }
}
