import java.util.Scanner;

public class j28op {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h,b,r,num1,num2;
        String op;

        System.out.println("select op t for  Arae of triangle");
        System.out.println("select op c for  Area of circle");
        System.out.println("select op p for Enterd number is positive or not");
        System.out.println("Enter A option :");
        op=sc.next();
        
        switch(op){
            case "t":
            System.out.println("Enter  h of Triangle");
            h=sc.nextInt();
            System.out.println("Enter b for Triangle :");
            b=sc.nextInt();
        

            System.out.println("Area of Triangle is :" +(h*b*0.5) );
            break;
            case "c":
            System.out.println("Enter a radius of circle" );
            r=sc.nextInt();
            System.out.println("Area of circle is :" +(3.14*r*r));
            break;
            case "p":
            System.out.println("Enter a num1 :");
            num1=sc.nextInt();
            if(num1>0){
                System.out.println("Enterd number is poitive");
             }else{
                System.out.println("Enterd num is negetive");
             }
             break;
             default:
             System.out.println("Wrong option");
            }
    }
}
