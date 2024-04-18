import java.util.*;

public class ReverseString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();           //Input String
        char[] ans = s.toCharArray();
        for (int i = ans.length - 1; i >= 0; i--) {
            System.out.print(ans[i]);   //Print reverse string
        }
    }
}
