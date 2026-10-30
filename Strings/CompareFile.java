public class CompareFile {

    public static void main(String[] args) {
        String name1 = "Vasu";
        String name2 = "Vasu";

        // s1 > s2; +ve value;
        // s1 == s2; 0 ;
        // s1 < s2; -ve value;
        
        if(name1.compareTo(name2) == 0){
            System.out.println("String are equal");
        }else{
            System.out.println("string are not equal");
        }
    }
}