import java.util.ArrayList;
import java.util.List;
public class ArrayList2 {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();

        //Check if an arraylist is empty or not by using isEmpty()
        System.out.println("The list is empty ? "+ l.isEmpty());

        l.add("apple");
        l.add("mango");
        l.add("orange");
        System.out.println("After adding elements the list contains the following :"+ l);
        System.out.println("Now the list  is empty or not : "+ l.isEmpty());

    }
}
