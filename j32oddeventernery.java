import java.util.Scanner;

public class j32oddeventernery {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        int number;
        System.out.println("enter a number:");
        number=sc.nextInt();

         String result =(number==0) ? "0" : (number%2==0) ? "even" : "odd";
         System.out.println("Enterd number is"+result);
        

        



    }
}