import java.util.Scanner;


public class j41sumcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ce=0,co=0;
        int se=0,so=0;
        System.out.println("Enter a number :");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i +"is even");
                ce++;
                co+=i;
            }else{
                System.out.println(i+ "is odd");
                se++;
                so+=i;
            }
        }
        System.out.println("Count of even numbers= " +  ce + " Sum  = " + co);
        System.out.println("Count of odd numbers= " +  se+ " Sum  = " + so);

            
        
    }
}
