import java.util.Scanner;

public class j44 {
    public static void main(String[] args) {
        int s=0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter number :");
        int n =sc.nextInt();
        
        for(int i=1;i<=n;i++){
           
            if(i%2==0){
                System.out.print(i*i + "+");
                s+=(i*i);
            }else{
                System.out.print(i*i*i + "+");
                s+=(i*i*i);
            }
        }
        System.out.println("\n sum " + s);
    }
}
