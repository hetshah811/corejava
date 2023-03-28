import java.util.Scanner;

public class jpattern142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int  n=sc.nextInt();
        

        
        int p=n;
           
            for (int i = 1; i <= n; i++) {
            
              for (int j = n; j >=i; j--) {
                System.out.print(" ");
              }
              
              for (int j = 1; j <= i; j++) {
               System.out.print("*"+" ");
              }
              p--;
              System.out.println();
            }
        for (int i = 1; i <= n; i++) {
        
          for (int j = 1; j <=i; j++) {
            System.out.print(" ");
          }
          
          for (int j = n; j >= i; j--) {
            System.out.print("*"+" ");
          }
          System.out.println();
        }
    }
}
