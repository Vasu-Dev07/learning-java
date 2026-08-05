import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner inputnaam = new Scanner(System.in);
        System.out.print("Please, \nTell me your \"NAME\": ");
        String name = inputnaam.nextLine();
        System.out.println("Good Morning " + name);
        System.out.println(name + ",,,Please tell me your age..");
        int age = inputnaam.nextInt();
        System.out.print("So you're age is: " +age);
        System.out.println("Dmn Nggaa You're OLDD>>>..");
    }
}
