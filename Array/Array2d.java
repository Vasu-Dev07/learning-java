import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int coloumns = input.nextInt();

        int Array2d[][] = new int[rows][coloumns];

        for(int i = 0; i < rows; i++){
            System.out.print("enter a row : ");
            for(int j = 0; j < coloumns; j++){
                Array2d[i][j] = input.nextInt();
            }
            System.out.println();
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < coloumns; j++){
                System.out.print(Array2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
