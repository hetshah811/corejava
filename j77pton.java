import java.util.Scanner;

public class j77pton{
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter limit :");
    int a[]=new int[100];
    int n,i;
    

    n=sc.nextInt();
    for (i=0;i<n;i++){
        System.out.println("enter value =>");
        a[i]=sc.nextInt();

    }
    
    System.out.println("Before");
    for(i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
    
    System.out.println("\nAfter");
    for(i=0;i<n;i++){
            System.out.print(a[i]*-1 + "  ");
    
    }
}
    
}
