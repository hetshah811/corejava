import java.util.Scanner;

public class j68krishnamurty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter number:");
        int number=sc.nextInt();
        int s=0,z=number;
    

        while(number!=0){
            int rem =number%10;
            int f=1;
             for(int i=1;i<=rem;i++){
                f=f*i;
            }
        s=s+f;
        number=number/10;

        }
        if(z==s){
            System.out.println("krishnamurty number");
        }else{
             System.out.println(" not krishnamurty number");
        }
            

        
       


    }
}
