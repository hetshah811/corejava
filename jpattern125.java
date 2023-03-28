import java.util.Scanner;

public class jpattern125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                if(j%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        
    }
    
}
