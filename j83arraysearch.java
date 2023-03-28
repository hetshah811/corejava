import java.util.Scanner;

public class j83arraysearch {
    public static void main(String[] args) {
        
        int a[]=new int[100];
        int i;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit of arary:");
        int n= sc.nextInt();
        for(i=0;i<n;i++){
            System.out.println("enter value=>");
            a[i]=sc.nextInt();
        }for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
         
        System.out.println("\nenter number :");
        int m=sc.nextInt();
        int p=0;
        
        for(i=0;i<n;i++){
          if(m==a[i]){
              
              p++;
              
              
          }
        }
      
      if(p==0){
        System.out.println("sorry ");
      }else{
        System.out.println(p);
      }

        
        
       
    }
}
