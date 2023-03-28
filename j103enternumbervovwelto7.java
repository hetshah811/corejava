import java.util.Scanner;

public class j103enternumbervovwelto7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.nextLine();
        
        int i=0;
       // System.out.println(str);
       for(i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o' ||ch=='u'){
            System.out.print(7);
            
           }
           else
           {
            System.out.print(ch);
           }
        }
        
    }
}
