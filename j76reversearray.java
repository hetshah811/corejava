import java.util.Scanner;

public class j76reversearray {
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
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nReversed array:");
        for (i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

        }

    }

