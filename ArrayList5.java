import java.util.*;
public class ArrayList5 {
    public static void main(String[] args) {
       List<String> branch=new ArrayList<>();
       branch.add("CSE");
       branch.add("EC");
       branch.add("Civil");
       branch.add("EX");
       branch.add("ME");
        System.out.println("The list of all branches is : "+branch);

        //remove particular index element
        branch.remove(2);
        System.out.println("After removing index(2) list of branch is : "+ branch);
    }
}
