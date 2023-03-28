import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class j14subject {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int sub1,sub2,sub3;
        System.out.println("Enter First Number :");
        sub1=sc.nextInt();
        System.out.println("Enter Second Number :");
        sub2=sc.nextInt();
        System.out.println("Enter thired Number :");
        sub3=sc.nextInt();
        int total=(sub1+sub2+sub3);
        System.out.println(" total of Three subject :" +total);

        if(total<50){
            System.out.println("C Grade");
        }else if(total<100){
        System.out.println("B Grade");}
        else if(total>100){
            System.out.println("A Grade");
        }
        
        
    }
    
}
