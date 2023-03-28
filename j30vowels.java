import java.util.Scanner;

public class j30vowels {
    public static void main(String[] args) {
        String op;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to check vowel :");
        op=sc.next();
        switch(op){
            case "A" :
            case "E" :
            case "I" :
            case "O" :
            case "U" :
           
            System.out.println("vowel");
           
            break;
            default :
            System.out.println("constant");
        }


        
       





        

    }
}
