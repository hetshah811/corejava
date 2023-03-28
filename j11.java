import java.util.Scanner;

public class j11 {
    public static void main (String[] args){
        int age;
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Plase Enter your age :");
        age=sc.nextInt();
        if(age>=18){
            System.out.println("You are eligeble for vote");

        }else{
            System.out.println("you are not eligeble for vote");
        }
    }
    
}
