
interface show{
    public void calculate(int a,int b);
}
public class LambdaExpression {
    public static void main(String[] args) {
        show s=(a,b)->{
            System.out.println(a*b);
        };
        s.calculate(54,6);
    }
}
