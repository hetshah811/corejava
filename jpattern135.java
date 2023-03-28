import java.util.Scanner;

public class jpattern135 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int  n=sc.nextInt();
        
       
        for (int i = 1; i <= n; i++) {
        
          for (int j = 1; j <=i; j++) {
            System.out.print(" ");
          }
          int   k=n-i+1;  
          for (int j = n; j >= i; j--) {
            
           
             System.out.print(k);
             k--;
            
          }
          
          System.out.println();
        }
        
    }
}
