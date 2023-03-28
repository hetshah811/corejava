import java.util.Scanner;

public class j104 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.nextLine();
       // String reversedstr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
    
            System.out.print(ch);
        }
        

        
    }
}
