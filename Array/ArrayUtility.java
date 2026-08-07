import java.util.Scanner;

public class ArrayUtility {
    public static void main(String[] args) {
        int[] arr = inputArray();
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

    public static void displayarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] +" ");
        }
        System.out.println();
    }
}
