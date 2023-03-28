import java.util.Scanner;

import javafx.scene.transform.Scale;

public class j21xerox {
    public static void main(String[] args) {
        System.out.println("Welcome Xerox shop");
        int pagenumber;
        int op;
        int pagenumber1,pagenumber2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Select option 1 for Xerox");
    
        System.out.println("select  option 2 for  page typing");
        
        System.out.println("Select option 3 for both ");
        op=sc.nextInt();
        

        if(op==1){
            System.out.println("Enter pagenumber of xerox :");
            pagenumber=sc.nextInt();
            if(pagenumber>50){
                System.out.println("Your order price is"+ (pagenumber*7));
            }else{
                System.out.println("Your order Price is "+(pagenumber*10));
            }

        }else if(op==2){
                System.out.println("Enter page number of typing ");
                pagenumber=sc.nextInt();
            if(pagenumber>50){
                System.out.println("Your order price is"+(pagenumber*15));
            }else{
                System.out.println("Your order price is"+(pagenumber*10));
            }

        }else if(op==3){
            System.out.println("Enter page number 1:");
        
            pagenumber1=sc.nextInt();
            System.out.println("Enter page number 2:");
            pagenumber2=sc.nextInt();
            if(pagenumber1>50 && pagenumber1>50){
                System.out.println("Your order price is :"+(pagenumber1*20));
            }else{
                System.out.println("Your order price is :"+(pagenumber2*25));
            }
            
        }

    }
    
}
