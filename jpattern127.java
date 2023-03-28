import java.util.Scanner;

public class jpattern127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();
       
        for(int i=1;i<=n;i++){
            int p=n;
            for(int j=n;j>=i;j--){
               
                System.out.print(p+" ");
                p--;
                
            }
            System.out.println();
        }
        
    }
}
