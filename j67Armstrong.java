import java.util.Scanner;

import javafx.scene.transform.Scale;

public class j67Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        int re=0,z=number,s=0;
        
        while(number!=0){
            int rem =number%10;//153%10=3  15%10=5  1%10=1
            s=s+(rem*rem*rem);//1            125       27
            number=number/10;//153/10=15   15/10=1  1/10=0

        }
        
        
        if(z==s){
            System.out.println("Armstrong number");
        }else{
            System.out.println("not Armstrong");
        }
        
    }
}
