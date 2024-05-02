 import java.util.ArrayList;
 import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();

        //add new element in List
        name.add("Arish");
        name.add("Abhishek");
        name.add("Akshat");
        name.add("Adarsh");

        System.out.println(name);

        //add new name at particular index
        name.add(3,"Ankit");
        System.out.println(name);
    }
}
