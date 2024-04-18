import java.util.*;

public class LastElement {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); //Size of an array
    
            int arr[] = new int[n];
            int len =arr.length;
            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();  
            }

            Arrays.sort(arr);
            
            System.out.println("The last element of an array is " + arr[len -1]);
    }
}
