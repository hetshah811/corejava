import java.util.Scanner;

public class j89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit :");
        int a[]=new int[100];
        int b[]=new int[100];
        int c[]=new int[100];
        int n1,n2,i;
        
       
        n1=sc.nextInt();
        for (i=0;i<n1;i++){
            System.out.println("enter value =>");
            a[i]=sc.nextInt();

        }
        for(i=0;i<n1;i++){
            System.out.print(a[i]+" ");
        }
        
        System.out.println("\nenter limit");
        n2=sc.nextInt();
        for (i=0;i<n2;i++){
            System.out.println("enter value =>");
            b[i]=sc.nextInt();

        }
        for(i=0;i<n2;i++){
            System.out.print(b[i]+" ");
        }
        int k=0;
        //int b[]=new int[100];
        System.out.print("\n new array");
        
        for(i=0;i<n1;i++)
        {
         c[k]=a[i];
         k++;
        }
        
        
        for(i=0;i<n2;i++)
        {
            c[k]=b[i];

            k++;
        }
        for(i=0;i<k;i++){
            
            System.out.print(c[i]+" ");
            
            
        }
        
      
       
        
       
            
        

        
    }
}
