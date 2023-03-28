import java.util.Scanner;

public class validemail107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your email id:");
        String str=sc.nextLine();
        int i=0;
        int y=0;
        int p=0;


        for(i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='.'){
                   y++;
               }
               else if(ch=='@'){
               p++;
           }
        }


        if(y<=2 && p<=1){
            System.out.println("valid email ");
        }else{
            System.out.println("not valid email");
        }
    
}
    
}
