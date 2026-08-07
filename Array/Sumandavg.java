import java.util.Scanner;

public class Sumandavg {
    public static void main(String[] args) {
        
        int[] arr = inputArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int avg = sum / arr.length;
        System.out.println("the sum is " + sum + " And the average is " + avg);
    }

    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the size of the Array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element number " + (i+1) + " : ");
            arr[i] = input.nextInt();
        }

        return arr;
    }
}
