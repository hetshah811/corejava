import java.util.Scanner;

import javax.swing.border.StrokeBorder;

public class j10 {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Enter the number :");
        n=sc.nextInt();
        if(n>0){
            System.out.println("Entred number is positive");
        }else{
            System.out.println("Entered number is nagetive");
        }
    }
    
}
