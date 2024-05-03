import java.util.*;
public class StackProgram {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        //insert element using push() method
        st.push("Arish");
        st.push("Abhishek");
        st.push("Adarsh");
        st.push("Abhinav");
        System.out.println(st);

        //remove element using pop() method
        st.pop();
        st.pop();
        System.out.println(st);
    }
}
