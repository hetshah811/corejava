import java.util.Scanner;

public class j57even {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("enetr number :");
     int n =sc.nextInt();
     int i=2;
        
        do{
            if(n%2==0){
        System.out.print(i);
        i++;}
        }while(i<=n);
    }
}
