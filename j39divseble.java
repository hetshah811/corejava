import java.util.Scanner;

public class j39divseble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number  limit:");
        int n =sc.nextInt();
        System.out.println("enter number for divide");
        int l =sc.nextInt();
        int c=0,s=0;
        for(int i =1;i<n;i++){
            if(i%l==0){
                
                c++;
                s+=i;
                System.out.println(i);
            }
        }
        System.out.println("Count = " +  c + " Sum  = " + s);
    }
}
