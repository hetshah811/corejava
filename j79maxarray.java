import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class j79maxarray {
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
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
         
            
        }
      int m=a[0];
      for(i=0;i<n;i++){
        if(m<a[i]){
            m=a[i];
        }
      }

    System.out.println("\nmaximum number "+m);

        
    }
}
