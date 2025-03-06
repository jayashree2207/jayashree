import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        string jay=sc.next().toLowerCase();
        String r="";
        cahr x[]=jay.toCharArray();
        int i;
        for(i=jay.Length()-1;i>0;i--){
            r+=x[i]+"";
        }
        System.out.println(r);
        if(r.equals(s)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
    
}
