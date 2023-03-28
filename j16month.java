import java.util.Scanner;

public class j16month {
    public static void main (String[] args){
        int number;
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter number :");
        number=sc.nextInt();
        if(number==1){
            System.out.println("january");
        }else if(number==2){
            System.out.println("feb");
        }else if(number==3){
            System.out.println("March");
        }else if(number==4){
            System.out.println("April");
            
        }else if(number==5){
            System.out.println("May");

        }else if(number==6){
            System.out.println("june");
        }else if(number==7){
            System.out.println("July");
        }else if(number==8){
            System.out.println("August");
        }else if(number==9){
            System.out.println("september");
        }else if(number==10){
            System.out.println("october");
        }else if(number==11){
            System.out.println("november");
        }else if(number==12){
            System.out.println("decembert");
        }   
    } 
}