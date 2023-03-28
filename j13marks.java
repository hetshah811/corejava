import java.util.Scanner;

import javafx.scene.transform.Scale;

public class j13marks {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int marks1,marks2,marks3;
        System.out.println("Enter First Number :");
        marks1=sc.nextInt();
        System.out.println("Enter Second Number :");
        marks2=sc.nextInt();
        System.out.println("Enter thired Number :");
        marks3=sc.nextInt();

        if(marks1>marks2){
            System.out.println(marks1 + "is greter");

        }else if(marks2>marks3){
            System.out.println(marks2+"is greater");
        }else if(marks3>marks2){
            System.out.println(marks3+"is greater");
        }
        
    }
    
}

/*
 * 3 subjects total , 0-50 C , 50-100 B , >100 A
 * 
 * 3 values max , 7 9 5 , 9 is greater
 * 
 */