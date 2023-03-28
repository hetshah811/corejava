import java.util.Scanner;

public class j53pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter number :");
        int n = sc.nextInt();
        int i=1;
        int y=1;
        while(i<=n){
            
            System.out.print(i + "x");
        
            y*= i;
            
            i++;
            
        }
        
        
        System.out.println("\n sum " + y);

    }
}
