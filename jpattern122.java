import java.util.Scanner;

public class jpattern122 {
    public static void main(String[] args) {
        int j;
         
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();

       
        for(int i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
