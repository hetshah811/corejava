import java.util.Scanner;

public class j74sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100];
        int b[]=new int[100];
        
        
        int n,i;
        

        System.out.println("enter limit of first array");
        n=sc.nextInt();
       
        for(i=0;i<n;i++){
            System.out.println("enter values of first array=>");
            a[i]=sc.nextInt();
           
        }
        for(i=0;i<n;i++){
            System.out.println("enter values of second array=>");
            b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            System.out.println(a[i]+b[i]);
            
        }
        


        
    }
}
