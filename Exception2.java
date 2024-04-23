import java.util.*;

class IsEligible extends RuntimeException {
    IsEligible(String msg) {
        super(msg);
    }

}

class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int umar = sc.nextInt();
        if (umar < 18) {
            throw new IsEligible("You are not eligible");
        } else {
            System.out.println("You are Eligible");
        }
    }
}