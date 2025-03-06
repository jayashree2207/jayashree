import java.util.*;
public class rowdec {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--,System.out.println()){
            for(int j=0;j<i;j++){
                System.out.print("   <^__^>");
            }
        }
    }
    
}
