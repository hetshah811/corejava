import java.util.Scanner;

public class j59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter number :");
        int n = sc.nextInt();
        int i=1;
        int y=1;
        do{
            
            System.out.print(i + "x");
        
            y*= i;
            
            i++;
            
        }while(i<=n);
        
        
        System.out.println("\n sum " + y);
        
    }
}
