import java.util.TreeSet;
public class TreeSetProgram {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(2);
        set.add(5);
        set.add(6);
        set.add(10);
        System.out.println(set);

        TreeSet<Integer> set2=new TreeSet<>();
        set2.add(63);
        set2.add(54);

        set2.addAll(set);
        System.out.println("After adding new element in TreeSet "+set2);

    }
}
