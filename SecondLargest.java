import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if (n <= 1) {
            System.out.println("-1");
        }
        else {
            int secondLargest = arr[n - 2];
            System.out.println(secondLargest);
        }

    }
}

