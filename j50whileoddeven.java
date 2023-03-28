import java.util.Scanner;

public class j50whileoddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int i=1;
        while (i<=n){
          String result =(i%2==0) ? i+" is even" : i+" is odd";
          System.out.println(result);
          i++;
         }
        }
      }
    
  