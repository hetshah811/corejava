import java.util.Scanner;

public class j71oddevenarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100];
        int n,i;
        
        System.out.println("enter limit of array :");
        n=sc.nextInt();
        for (i=0;i<n;i++){
            System.out.println("enter value =>");
            a[i]=sc.nextInt();

        }
        for(i=0;i<n;i++){
            if(a[i]%2==0){System.out.println(a[i]+ "is even");}
            else{System.out.println(a[i]+ "is odd");}
            
            
            
        }
    }
}
