public class Operations {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Vasu");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(2, 'n');
        System.out.println(sb);

        sb.insert(0, 'M');
        sb.insert(1, 'y');
        sb.insert(2, ' ');
        System.out.println(sb);

        // delete the extra
        sb.delete(2, 3);
        System.out.println(sb);

    }
}
