import java.util.Scanner;

public class j17squareqube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,op;

        System.out.println("Enter 1 for square");
        System.out.println("Enter 2 for cube");
        System.out.println("Enter option =>");
        op=sc.nextInt();

        if(op==1)
        {
            System.out.println("Enter a  number :");
            number=sc.nextInt();
            
            System.out.println("squre of number is :"+((number)*(number)));     
        }
        else if(op==2)
        {
            System.out.println("Enter a  number :");
            number=sc.nextInt();
        
            System.out.println("cube of number is :" +((number*number*number)));
        
        }
        else{
            System.out.println("Wrong opt");
        }
    }
    
}

/*
 * 1 2 3 4 
 * 
 * 1 area of tri 2 area of cricle 3 pos /neg
 * 
 */