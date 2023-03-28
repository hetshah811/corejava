import java.util.Scanner;

import javax.lang.model.element.Element;

public class j12 {
    public static void main (String[] args){
        long a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount which you have");
        a=sc.nextLong();
        if(a>1000){
            System.out.println("we eat Piazza today");
            
        }else{
            System.out.println("we eat Maggie today");
        }
    }
    
}
