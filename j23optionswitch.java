import java.util.Scanner;

public class j23optionswitch {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int op,h,b,r,num1,num2;

        System.out.println("select op 1 for  Arae of triangle");
        System.out.println("select op 2 for  Area of circle");
        System.out.println("select op 3 for Enterd number is positive or not");
        System.out.println("Enter A option :");
        op=sc.nextInt();
        
        switch(op){
            case 1:
            System.out.println("Enter  h of Triangle");
            h=sc.nextInt();
            System.out.println("Enter b for Triangle :");
            b=sc.nextInt();
        

            System.out.println("Area of Triangle is :" +(h*b*0.5) );
            break;
            case 2:
            System.out.println("Enter a radius of circle" );
            r=sc.nextInt();
            System.out.println("Area of circle is :" +(3.14*r*r));
            break;
            case 3:
            System.out.println("Enter a num1 :");
            num1=sc.nextInt();
            if(num1>0){
                System.out.println("Enterd number is poitive");
             }else{
                System.out.println("Enterd num is negetive");
             }
             break;
             case 4:
             System.out.println("Wrong option");




        }

    }
}
