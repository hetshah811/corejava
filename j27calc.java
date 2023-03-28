import java.util.Scanner;

public class j27calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number1,number2;
        String op;
        
        System.out.println("choos op + for Addition");
        System.out.println("choos op - for substartction ");
        System.out.println("choos op * for Multiplication ");
        System.out.println("choos op / for Divsion");
        System.out.println("enter op :");
        op=sc.next();

        switch(op){
            case "+":
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("Addition of numbers are :" + (number1+number2));
            break;

            case "-":
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("substartction of numbers are :" + (number1-number2));
            break;
            case "*":
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("Multiplication of numbers are  :"+ (number1*number2));
            break;
            case "/":
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("Divsion of numbers are :" + (number1/number2));

            
            default:
            System.out.println("Wrong option");


            
        
        }
    }
}
