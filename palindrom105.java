import java.util.Scanner;

public class palindrom105{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.nextLine();
       // String reversedstr="";
       
        
        int k=str.length()-1;
        int m=0;
        for(int i=0;i<k;i++){
            char ch1=str.charAt(i);
            char ch2=str.charAt(k);
            if(ch1 != ch2){
        
                m=1;
                break;
            }
          k--;
          
             
        }
        if(m==0){
            System.out.println(str+" is palindrom");
        }else{
        System.out.println(str+" isnot palindrom");}
     
    

      
    }
}
