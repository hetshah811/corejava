import java.util.Scanner;

public class j6SimpleInt {
   
    public static void main (String[]  args){
    
        double p,r,t;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter privniple value =>" );
        p=sc.nextDouble();

        System.out.print("Enter intrest Rate value =>");
        r=sc.nextDouble();
        
        System.out.print("Enter privniple value =>");
        t=sc.nextDouble();


    System.out.println("Simple intrest :"+ (p*r*t/100));
    }
}
