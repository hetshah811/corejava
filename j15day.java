import java.util.Scanner;

public class j15day {
     public static void main (String[] args){
        int number;
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter number :");
        number=sc.nextInt();
        if(number==1){
            System.out.println("Monaday");
        }else if(number==2){
            System.out.println("Tuseday");
        }else if(number==3){
            System.out.println("Wenesday");
        }else if(number==4){
            System.out.println("Thursday");
        }else if(number==5){
            System.out.println("Friday");
        }else if(number==6){
            System.out.println("Saturday");
        }else if(number==7){
            System.out.println("sunday");
        }
    }
    
}
