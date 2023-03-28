import java.util.Scanner;

public class jpattern141 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
         
    
        int p=n;
           
            for (int i = 1; i <= n; i++) {
            
              for (int j = n; j >=i; j--) {
                System.out.print(" ");
              }
              
              for (int j = 1; j <= i; j++) {
               System.out.print(p+" ");
              }
              p--;
              System.out.println();
            }
    }
}
