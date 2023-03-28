import java.util.Scanner;

public class j54 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n=sc.nextInt();
        int i=n;
        int y=1;
        while(i>=1){
            System.out.print(i + "x");
            
            y*=i;
            
            i--;
        
        
        }
        System.out.println("\nsum "+y);
        
    }
}
