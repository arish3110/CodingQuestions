import java.util.*;

class Minimum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Size of an array

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 1st Approach to find minimum number of an Array
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);

        // 2nd Approach to find minimum number of an Array
        Arrays.sort(arr);
        System.out.println(arr[0]);

    }
}