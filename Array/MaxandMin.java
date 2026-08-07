public class MaxandMin {
    public static void main(String[] args) {
        Sumandavg inarr = new Sumandavg();
        int[] arr = inarr.inputArray();

        System.out.println("Maximum Element of the Array is: " + max(arr));
        System.out.print("Minimum Element of the Array is: " + min(arr));
        
    }

    public static int max(int[] arr ){
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
