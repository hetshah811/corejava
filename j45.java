import java.util.Scanner;

public class j45 {
    public static void main(String[] args) {
        int s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n =sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.print(i +"x");
            s+=i;
        }
        System.out.println("\n sum = " + s);
    }
}
