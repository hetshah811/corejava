import java.util.Scanner;

import javax.lang.model.element.Element;

public class j47 {

    public static void main(String[] args) {
        int s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            s += i;
            
        if(i%2==0){
            
        System.out.print("+"+ i );
        s+=i;
          }
        else{
        System.out.print("-" + i);
        s-=i;
 
        }

    
        }
        System.out.println("\n sum :" +s);
    }
}
