public class MergeSorted {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();

        int i = 0;
        int j = 0;

        int[] result = new int[arr1.length + arr2.length];
        int idx = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[idx] = arr1[i];
                i++;
                idx++;
            }else{
                result[idx] = arr2[j];
                j++;
                idx++;
            }
        }

        while (i < arr1.length) {
            result[idx] = arr1[i];
            i++;
            idx++;
        }

        while (j < arr2.length) {
            result[idx] = arr2[j];
            j++;
            idx++;
        }
        
         ArrayUtility.displayarr(result);
    }
}
