import java.util.Scanner;

public class Occourances {
    public static void main(String[] args) {
        
        Sumandavg inarr = new Sumandavg();
        int[] arr = inarr.inputArray();

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the occured Number: ");
        int num = in.nextInt();

        System.out.print("Number of Occurences are: " + Occourence(arr, num));

    }

        public static int Occourence(int[] arr, int num) {
            int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                count++;
            }
        }
        return count;
    }
}
