import java.util.Scanner;

public class j96spececount {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.nextLine();
        int y=0;
        int i=0;
       // System.out.println(str);
        
      
     
    for(i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch==' '){
               y++;
           }
       }
       System.out.println(" Total spaces are : " +  y);

    }
    }

