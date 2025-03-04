
import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark=sc.nextInt(),pass=50;
        if(mark>=pass)
        {
            System.out.println("ohh passed");
        }
        else{
            System.out.println("aww failed");
        }
    }
    
}
