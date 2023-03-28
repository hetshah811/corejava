import java.util.Scanner;

public class j84 {
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
        System.out.println("\nnew array");
        int b[]=new int[100];
        for(i=0;i<n;i++){
            b[i]=a[i];
            System.out.print(b[i]+" ");
       }

        
    }
}
