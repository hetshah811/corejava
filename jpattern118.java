import java.util.Scanner;

class jpattern118{
    public static void main(String[] args) {
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(j=1;j<=i;j++){
               System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}