import java.util.Scanner;

public class j9 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a,b;
        System.out.println("enter first number :");
        
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();

         if(a>b){
            System.out.println(a+"is bigger than " + b);
         }else{
            System.out.println(b+" is bigger than " + a);
         }

    }
    
}
