import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

public class j48prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();
        int y=0;
        if (n==1 )
        {
          System.out.println(n+"is not prime");
        }
        else
        {
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println(n +"is not  prime");
                y=1;
                break;
                
            }
        }if (y==0){
            System.out.println(n + "is prime number");
        }
        
    }







































































        


        
    }
}
