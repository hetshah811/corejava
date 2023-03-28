import java.util.Scanner;

public class j58 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int i=1;
        do{
          String result =(i%2==0) ? i+" is even" : i+" is odd";
          System.out.println(result);
          i++;
         }while(i<=n);

    }
}
