import java.util.*;

public class ConcatMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("The first string is :");
        String str1 = sc.nextLine();

        System.out.println("The second string is :");
        String str2 = sc.nextLine();

        System.out.println("After concatination the String is : " + str1.concat(str2));
    }
}