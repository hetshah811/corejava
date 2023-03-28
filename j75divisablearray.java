import java.util.Scanner;

public class j75divisablearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100];
        int n,i,d;
        int y=0;int p=0;
        System.out.println("enter limit :");
        n=sc.nextInt();
        for (i=0;i<n;i++){
            System.out.println("enter value =>");
            a[i]=sc.nextInt();

        }
        System.out.println("enter number for divide");
        d=sc.nextInt();
        for(i=0;i<n;i++){
            
           
        if(a[i]%d==0){
            System.out.println("divisable by"+a[i]);
            p++;
            y+=a[i];

        }
        

    }
    System.out.println("count"+p+"\n"+"sum"+y);
        
    if(p==0)
    {
        System.out.println("sorry");
    }           
        }
        
        
    }

