import java.util.Scanner;

public class j65Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        int re=0,z=number;
        
        while(number!=0){
            int rem =number%10;
            re=re*10+rem;
            number=number/10;

        }
        
        System.out.println(re);
        if(z==re){
            System.out.println("Palindrom number");
        }else{
            System.out.println("enterd number is not palindrom");
        }
    }
}
