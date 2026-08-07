public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }

        System.out.print("Reversed Array will be..");
        ArrayUtility.displayarr(arr);
    }
}
