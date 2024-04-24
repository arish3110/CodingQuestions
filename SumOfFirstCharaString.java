import java.util.*;

public class SumOfFirstCharaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int sum = s.charAt(0);
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == ' ') {
                sum += s.charAt(++i);
            }
        }
        System.out.println(sum);
    }
}
