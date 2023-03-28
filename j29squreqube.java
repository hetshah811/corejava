import java.util.Scanner;

public class j29squreqube {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number;
        String op;


        System.out.println("Enter s for square");
        System.out.println("Enter c for cube");
        System.out.println("Enter option =>");
        op=sc.next();

        switch (op) {
            case "s":
            case "S":
            System.out.println("Enter a number for squre :");
            number=sc.nextInt();
            System.out.println("squre of"+" "+ " "+number+" is "+" "+ (number*number));
            break;
            case "c":
            case "C":
            System.out.println("Enter number for cube :");
            number=sc.nextInt();
            System.out.println("cube of"+" "+ " "+number+" is "+" "+ (number*number*number));
            break;
            default :
            System.out.println("wrong option");

        
        }

    }
}
