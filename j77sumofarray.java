import java.util.Scanner;

public class j77sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100];
        int n,i;
        int s=0;
        System.out.println("enter limit :");
        n=sc.nextInt();
        for (i=0;i<n;i++){
            System.out.println("enter value =>");
            a[i]=sc.nextInt();

        }
        for(i=0;i<n;i++){
            System.out.println(a[i]);
            s+=a[i];
        }
        System.out.println("sum of all :"+s);


        
    }
}
