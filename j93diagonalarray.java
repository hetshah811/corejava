import java.util.Scanner;

public class j93diagonalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][]=new int [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("enter value=>");
                a[i][j]=sc.nextInt();
                
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
                
                
            }
            System.out.println(" ");
            
        }
        System.out.println("new array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                
                
                    System.out.print(a[i][j]+" ");}
                    else{
                        
                        System.out.print("* ");
                    }
             
            }
            System.out.println(" ");
        }
    }
}
