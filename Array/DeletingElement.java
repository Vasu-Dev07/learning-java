import java.util.Scanner;

public class DeletingElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Please enter the number you want to Delete.. ");
        int num = input.nextInt();
        int[] newarr = newarr(arr, num);
        System.out.println("Your new Array is: ");
        ArrayUtility.displayarr(newarr);

    }

    public static int[] newarr(int[] arr, int num) {
            int occ = Occourances.Occourence(arr, num);
            if (occ == 0) {
                return arr;
            }
            int newsize = arr.length - occ;
            int[] newarr = new int[newsize];

            int i = 0, j = 0;
            while (i < arr.length) {
                if (arr[i] != num) {
                    newarr[j] = arr[i];
                    j++;
                }
                i++;
            }
            return newarr;
    }
}
