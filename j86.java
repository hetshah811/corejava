import java.util.Scanner;

public class j86 {
    public static void main(String[] args) {
       
        
            Scanner sc = new Scanner(System.in);
            int a[]=new int[100];
            
            int n,i;
            System.out.println("enter limit :");
            n=sc.nextInt();
            for (i=0;i<n;i++){
                System.out.println("enter value =>");
                a[i]=sc.nextInt();
    
            }
            System.out.println("before");
            for(i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            
            int k=0;
            int b[]=new int[100];
            System.out.print("\nafter");
            
            for(i=0;i<n;i++)
            {
                if(a[i]%2==0){
                    b[k]=a[i];
                    k++;
                }
            }
            for(i=0;i<k;i++){
                
                System.out.print("\n"+b[i] +" ");
                
            }
            
               }
           }
            
           
  //          for(i=0;i<n;i++){
   //             b[i]=(a[i]%2==0);
     //           System.out.print(b[i]+" ");
           

        
    
    

