import java.util.Scanner;

public class j22calculatorswitch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number1,number2,op;
        System.out.println("enter op :");
        op=sc.nextInt();
        System.out.println("choos op 1 for Addition");
        System.out.println("choos op 2 for substartction ");
        System.out.println("choos op 1 for Multiplication ");
        System.out.println("choos op 1 for Divsion");
       
        switch(op){
            case 1:
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("Addition of numbers are :" + (number1+number2));
            break;
            case 2:
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("substartction of numbers are :" + (number1-number2));
            break;
            case 30:
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("Multiplication of numbers are  :"+ (number1*number2));
            break;
            case 4:
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("Divsion of numbers are :" + (number1/number2));



            
        
        }
    }
    
}
