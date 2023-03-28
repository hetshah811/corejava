import java.util.Scanner;

public class j51tablewhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        int i=1;
        while(i<=10){
            System.out.println(n+"x" + i +"=" + (n*i));
            i++;
        }
    }
}
