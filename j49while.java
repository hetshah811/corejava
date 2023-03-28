import java.util.Scanner;

public class j49while {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("enetr number :");
     int n =sc.nextInt();
     int i=1;
        
        while(i<=n){
        System.out.println(i+"--" +(i*i));
        i++;
    }
    }
}
