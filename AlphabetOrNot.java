import java.util.*;

public class AlphabetOrNot{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char [] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if((ch[i] >= 65 && ch[i] <= 90) || (ch[i]>=97 && ch[i]<= 122)){
                System.out.println("This is Alpahabet "+ ch[i]);
            }
            else{
                System.out.println("This is not Alphabet "+ ch[i]);
            }
        }
    }
}
