import java.util.Scanner;

interface start{
    public void run(int x);
}
public class EvenNumberLambdaExpression {
    public static void main(String[] args) {
        start s=(x)->{
            if(x % 2==0)
            System.out.println("Even Number");
            else
                System.out.println("Not Even Number");
        };
        s.run(1508);
    }
}
