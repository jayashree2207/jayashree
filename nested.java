public class nested {
    public static void main(String[] args) {
        int mark=100;
        if(mark>=35){
            System.out.println("passed");
            if(mark>80){
                System.out.println("good score");
                if(mark==100){
                    System.out.println("got centum");
                }
            }
        }
        else{
            System.out.println("aww failed");
        }
    }

    
}
