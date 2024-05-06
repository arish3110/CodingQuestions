import java.util.HashSet;

public class HashSetProgram2 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<Integer>();
        set.add(10);
        set.add(50);
        set.add(43);
        set.add(65);
        set.add(12);

        System.out.println(set);
        //remove specific element from HashSet
        set.remove(43);
        System.out.println("After removing element from HashSet "+set);
    }
}
