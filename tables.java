import java.util.*;
public class tables {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=i*n;
            System.out.printf("%d * %d = %d\n",i,n,a);

        }
    }

}
