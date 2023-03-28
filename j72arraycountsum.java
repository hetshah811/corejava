import java.util.Scanner;

public interface j72arraycountsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100];
        int n,i;
        int y=0;int s=0;
        int p=0;int q=0;
        System.out.println("enter limit of array :");
        n=sc.nextInt();
        for (i=0;i<n;i++){
            System.out.println("enter value =>");
            a[i]=sc.nextInt();

        }
        for(i=0;i<n;i++){
            if(a[i]%2==0){System.out.println(a[i]+ " is even");
            p++;
            q+=a[i];

        }
            else{System.out.println(a[i]+ " is odd");
            y++;
            s+=a[i];
        
        }
           
            
        }
        System.out.println("sum of even numbers="+q+"\n"+"count of even numbers="+p);
        System.out.println("sum of odd numbers="+s+"\n"+"count of odd numbers="+y);
    }
}
