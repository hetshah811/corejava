import java.util.Scanner;

public class j64reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for reverse");
        
       int number=sc.nextInt();
       int reverse=0;
       while(number!=0){
        int Reminder =number%10;
        reverse =reverse*10+ Reminder;
        number=number/10;
       }
       System.out.println(reverse);
       

                
            }
        }


        
    

