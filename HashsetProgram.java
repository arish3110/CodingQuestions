import java.util.*;

public class HashsetProgram {
    public static void main(String[] args) {
      HashSet<String> hs=new HashSet<>();
      hs.add("Arish");
      hs.add("Amit");
      hs.add("Bhuvan");
      hs.add("Chunnu");
      hs.add("Aman");
      hs.add("Gaurav");

      //add duplicate element that will be ignored
        hs.add("Arish");
        hs.add("Aman");

        //Display names
      System.out.println(hs);
    }
}
