import java.util.Scanner;

public class j46 {
static float s=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
        System.out.print(("1/"+i)+ "+");
        s+=(1/i+1);
    }
    System.out.println("\n sum " +s);

    
    }
}
