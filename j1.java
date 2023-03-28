import java.util.Scanner;

class j1
{
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       
        int a,b;
        System.out.println("Enter first integer :");
        a=sc.nextInt();
        System.out.println("Enter Second Integer :");
        b=sc.nextInt();

        System.out.println("Add = " + (a+b));
        System.out.println("div = " + (a-b));
        System.out.println("sub = " + (a*b));
        System.out.println("div = " + (a/b));

    }
}