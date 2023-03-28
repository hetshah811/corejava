import java.util.Scanner;

public class validemail108 {
    public static void main(String[] args) {
        int y=0;
        int p=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter emailid:");
        String str=sc.nextLine();
        for( int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='.'){
                   y++;
               }
               else if(ch=='@'){
               p++;
           }

        }
        if(y<=1 && p>=1){
            System.out.println("valid");
        }else 
        {
            System.out.println("not valid");
        }
        
    }
}
