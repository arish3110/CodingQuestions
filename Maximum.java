import java.util.*;

public class Maximum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Size of an array

        int arr[] = new int[n];
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        // 1st Approach to find maximum number of an array
        int max = arr[len - 1];
        for (int i = 0; i < len; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println(max);

        // 2nd approach to find maximum value in array
        Arrays.sort(arr);
        System.out.println(arr[len - 1]);
    }
}
