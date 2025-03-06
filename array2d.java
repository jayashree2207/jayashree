
import java.util.*;

public class array2d {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("enter the array elements:");
        for (int i=0;i<n;i++){
             for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++,System.out.print("\n")){
            for(int j=0;j<=n;j++){
                System.out.print(arr[i][j]+" ");
            }

        }
            
        }

    }
    
    

