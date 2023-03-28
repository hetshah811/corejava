import java.util.Scanner;

public class j99lowecase {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.nextLine();
        int y=0;
        int i=0;
       // System.out.println(str);
        
      
     
    for(i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch>='a' && ch<='z'){
               y++;
           }
       }
       System.out.println(" Total lowercase letters are : " +  y);
    }
}
