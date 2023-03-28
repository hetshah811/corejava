import java.util.Scanner;

public class j62dowhilecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1,number2,op;
        
        do{
        System.out.println("choos op 1 for Addition");
        System.out.println("choos op 2 for substartction ");
        System.out.println("choos op 3 for Multiplication ");
        System.out.println("choos op 4 for Divsion");
        
        System.out.println("enter op :");
        op=sc.nextInt();

       
        if(op==1){
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("Addition of numbers are :" + (number1+number2));

        }else if(op==2){
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("substartction of numbers are :" + (number1-number2));
        }else if(op==3){
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("Multiplication of numbers are  :"+ (number1*number2));

        }
        else if(op==4){
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("Divsion of numbers are :" + (number1/number2));}
        else if(op==5){
         System.out.println("bye");
        }else{
                System.out.println("Wrong op");
        }
    }while(op!=5);
        

    }
}
