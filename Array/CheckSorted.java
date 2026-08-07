public class CheckSorted {
    public static void main(String[] args) {
        Sumandavg inarr = new Sumandavg();
        int[] arr = inarr.inputArray();
        
        boolean isInc = isIncreasing(arr);
        boolean isDec = isDecreasing(arr);

        if (isDec || isInc) {
            System.out.println("Your Array is sorted...");
        }else {
            System.out.println("Your Array is not sorted..");
        }
    }

    public static boolean isDecreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i-1]){
                return false;
            }
    }
    return true;
  }
}
