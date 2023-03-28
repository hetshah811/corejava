import java.util.Scanner;

public class j73positivenegativearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[100]; 
        int n,i;
        int p=0;int b=0;
        int c=0;int d=0;
        System.out.println("Enter limit of array :");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.println("enter value=>");
            a[i]=sc.nextInt();

        }
        for(i=0;i<n;i++){
            if(a[i]>0){System.out.println(a[i]+" is postive numbers");
        p++;
        b+=a[i];

    }else {
        System.out.println(a[i]+"is negitive number");
        c++;
        d+=a[i];
    }
        }
        System.out.println("sum of positive numbers="+b+"\n"+"count of positive numbers="+p);
        System.out.println("sum of negitive numbers="+c+"\n"+"count of negitive numbers="+d);
    }
}
