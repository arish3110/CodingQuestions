import java.util.*;

public class ArrayBoundException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[7];
        try{
             for(int i=0;i<7;i++){
              a[7]=sc.nextInt();
            }
            System.out.println("Hellooo");
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Not printed because of "+e );
        }
       
    }
}
