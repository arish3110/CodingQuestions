import java.util.*;

public class LowerUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Convert string into Lower Case
        System.out.println("The string in LowerCase is : " + s.toLowerCase());

        // Convert string into Upper Case
        System.out.println("The string in UpperCase is : " + s.toUpperCase());
    }

}