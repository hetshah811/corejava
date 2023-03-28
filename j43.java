import java.util.Scanner;

public class j43 {
    public static void main(String[] args) {
        int s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print((i*i) + " + ")  ;
            s+=(i*i);
            
            
        }
        
        
          System.out.println("\nsum" + s);
    }
}
