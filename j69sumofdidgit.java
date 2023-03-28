import java.util.Scanner;

public class j69sumofdidgit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        int sum=0;
        
        while(number!=0){
            int re =number%10;
            sum+=re;
            number=number/10;

        }
        System.out.println(sum);
        
    }
}
