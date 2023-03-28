import java.util.Scanner;

public class j63charcalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1,number2;
        char op;
        
        do{
        System.out.println("choos op + for Addition");
        System.out.println("choos op - for substartction ");
        System.out.println("choos op * for Multiplication ");
        System.out.println("choos op / for Divsion");
        System.out.println("choose op e for exit");
        
        System.out.println("enter op :");
        op=sc.next().charAt(0);

       
        if(op=='+'){
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("Addition of numbers are :" + (number1+number2));

        }else if(op=='-'){
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("substartction of numbers are :" + (number1-number2));
        }else if(op=='*'){
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("Multiplication of numbers are  :"+ (number1*number2));

        }
        else if(op=='/'){
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("Divsion of numbers are :" + (number1/number2));}
        else if(op=='e'){
         System.out.println("bye");
        }else{
                System.out.println("Wrong op");
        }
    }while(op!='e');
    }
    
}
