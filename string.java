import java.util.*;
public class string {
    public static void main(String[]args){
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char arr[]=s.toCharArray();
        System.out.println(arr[3]);
        System.out.println("length of array:"+(s.length()));
        System.out.println("char position:"+(s.charAt(0)));
    }
    
}
