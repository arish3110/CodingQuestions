import java.util.Vector;

public class VectorProgram {
    public static void main(String[] args) {
        Vector vc=new Vector();
         vc.add("Arish");
         vc.add("Viraj");
         vc.add("Abhishek");
         vc.add("Akash");
        System.out.println(vc);

       int size=vc.size();
       for(int i=0;i<size;i++){
           System.out.println(vc.get(i));
       }
    }
}
