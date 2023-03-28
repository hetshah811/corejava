import java.util.Scanner;

public class j56dowhiletable {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enetr number :");
     int n =sc.nextInt();
     int i=1;
        
        do{
            System.out.println(n + "x" + i +"="+(n*i));
            i++;
        }while(i<=n);
    }
    }

