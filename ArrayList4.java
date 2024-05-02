import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class ArrayList4 {
    public static void main(String[] args) {
        List<String> obj=new ArrayList<>();

        obj.add("Car");
        obj.add("Truck");
        obj.add("Scooter");
        obj.add("Ship");

        //Retrieve the element at given index
        String obj1= obj.get(0);
        String obj2 =obj.get(3);
        System.out.println("The first object is "+ obj1+" and third one is "+obj2);

        //Modify the element at particular index
        System.out.println("The list of object is "+obj);

        obj.set(2,"Aeroplane");
        System.out.println("Modify list of obj "+obj);
    }
}
