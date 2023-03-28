import java.util.Scanner;

public class j88ptn {
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
        //System.out.println("before");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
        int k=0;
        int b[]=new int[100];
        System.out.print("\npostive  array");
        
        for(i=0;i<n;i++)
        {
            if(a[i]>0){
                b[k]=a[i];
                k++;
            }
        }
        for(i=0;i<k;i++){
            
            System.out.print("\n"+b[i] +" ");
            
        }
        System.out.println("\n nagetive  arary");
        int c[]=new int[100];
        int p=0;
        for(i=0;i<n;i++)
        {
            if(a[i]<0){
                c[p]=a[i];
                p++;
            }
        }
        for(i=0;i<p;i++){
            
            System.out.print("\n"+c[i] +" ");
            
        }
    }
}
