import java.util.Scanner;

public class j42for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=0;
        System.out.println("Enter number :");
        int n=sc.nextInt();
        

        for(int i=1;i<=n;i++){
            System.out.print(i + " + ");
            s+=i;
        }

        System.out.println("\nSum = " + s);
    }
}
