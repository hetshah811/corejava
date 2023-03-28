import java.util.Scanner;

public class j37oddevenfor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            
            String result =(i%2==0) ? i+" is even" : i+"is odd";
            System.out.println(result);
        
            }
            
        }

    }

