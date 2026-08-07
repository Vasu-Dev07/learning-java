public class Palindromeornot {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();

        int start = 0;
        int end = arr.length -1;

        while(start < end) {
            if (arr[start] != arr[end]) {
                System.out.println("false");
                return;
            }
            start++;
            end--;
        }
            System.out.println("true");
    }
}
