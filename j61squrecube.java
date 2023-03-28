import java.util.Scanner;

public class j61squrecube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int op,n;

        do{
        System.out.println("press 1 for squre ");
        System.out.println("press 2 for cube");
        System.out.println("press 3 for exit");
        System.out.println("enter option :");
        op= sc.nextInt();
        
        
        if(op==1){
            System.out.println("enter number :");
            n=sc.nextInt();
            System.out.println("squre of number" + (n*n));
        }else if (op==2){
            System.out.println("enter number");
            n=sc.nextInt();
            System.out.println("cube of number"+ (n*n*n));
        }
        else if (op==3){
            System.out.println("bye");
          }
        else{
            System.out.println("wrong option");
        }

        
    }while(op!=3);
    }

}