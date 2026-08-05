
public class While1 {
    public static void main(String[] args) {
        /* 
        char ch = 'a';
        Printch(ch);
        Printch('c');

        int num = Sum(15, 20);
        System.out.println("The sum of 15 and 20 is: " + num);
        num = Sum(15, 20, 30);
        System.out.println("The sum of 15, 30 and 20 is: " + num);
        */

        // for (int i = 1; i <= 5; i++) {

        //     for (int j = 1; j <= i; j++) {

        //         System.out.print( ch + " ");
                
        //     }
            
        //     System.out.println(" ");
            
        // }

        int[] vasu1 = new int[5];
        int vasu2[] = new int[10];
        int[] vasu3 = {5, 6, 7, 8};

        for (int i = 0; i < vasu3.length; i++) {
            System.out.println(vasu3[i]);
        }

        
    }

    public static void Printch(char ch) {

        int i = 1;
        while (i <= 5){

            int j = 1;
            while (j <= i){
                System.out.print( ch + " ");
                j++;
            } 
            System.out.println();
            ch++;
            i++;
        } 
    }

    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Sum(int a, int b, int c) {
        return a + b + c;
    }
}