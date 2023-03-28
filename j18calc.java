import java.util.Scanner;

import javax.lang.model.element.Element;
import javax.lang.model.util.ElementScanner6;

import javafx.scene.transform.Scale;

public class j18calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1,number2,op;
        System.out.println("enter op :");
        op=sc.nextInt();
        System.out.println("choos op 1 for Addition");
        System.out.println("choos op 2 for substartction ");
        System.out.println("choos op 1 for Multiplication ");
        System.out.println("choos op 1 for Divsion");

       
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

        }else if(op==4){
            System.out.println("enter number1");
            number1=sc.nextInt();
            System.out.println("enter number2");
    
            number2=sc.nextInt();
            System.out.println("Divsion of numbers are :" + (number1/number2));
        }else{
                System.out.println("Wrong op");
        }
    }
    
}
