import java.util.Scanner;
public class mark {
    public static void main(String[]args)
    {
        @SuppressWarnings("resource")
        Scanner doechii=new Scanner(System.in);
        int tamil,english,japanese,science,social;

        System.out.println("enter the marks:");
        tamil=doechii.nextInt();
        english=doechii.nextInt();
        japanese=doechii.nextInt();
        science=doechii.nextInt();
        social=doechii.nextInt();
        
        int total=(tamil+english+japanese+science+social);
        
        System.out.println("total marks:"+total);
        int avg=(total/5);
        System.out.println("avg marks:"+avg);


    }
    
    
}
