import java.util.*;

public class Exception {
    void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            System.out.println(a / b);
        }
    }

    public static void main(String[] args) throws ArithmeticException {
        Exception e = new Exception();
        e.divide(10, 0);
    }
}
