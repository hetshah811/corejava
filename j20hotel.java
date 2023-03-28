import java.util.Scanner;

import javafx.scene.transform.Scale;

public class j20hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Our hotel sir");
        System.out.println("Here the option for order");
    
        int op,quntity;
        System.out.println("enter option for order :");
        op=sc.nextInt();
        if(op==1){
            System.out.println("you choose pizza");
            System.out.println("enter the quntity of pizza");
            quntity=sc.nextInt();
            
                System.out.println("your order price is:"+(quntity*300+ "Rs"));

        }else if(op==2){
            System.out.println("you choose Maggie");
            System.out.println("enter a quantitiy of Maggie");
            quntity=sc.nextInt();
            
            System.out.println("your order price is:"+(quntity*50)+"Rs");
        }else if(op==3){
            System.out.println("you choose Burger");
            System.out.println("enter a quantitiy of burger ");
            quntity=sc.nextInt();
            System.out.println("your order price is:"+(quntity*100)+"Rs");}
            
            else if(op==4){
                System.out.println("you choose Dosa");
                System.out.println("enter a quantitiy of Dosa ");
                quntity=sc.nextInt();
                
                System.out.println("your order price is:"+(quntity*150)+"Rs");
        }else if(op==5){
            System.out.println("you choose  hakka noodles");
            System.out.println("enter a quantitiy of  hakka noodles ");
            quntity=sc.nextInt();
            
            System.out.println("your order price is:"+(quntity*200)+"Rs");
        }
    }
}