import java.util.Scanner;

public class multiplicatonmatrix {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        int a[][]=new int [3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
       
            
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("enter value=>");
                a[i][j]=sc.nextInt();
                
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
                
                
            }
            System.out.println(" ");
            
        }
        for( i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("enter value=>");
                b[i][j]=sc.nextInt();
                
            }
        }
        for(i=0;i<3;i++){
            for( j=0;j<3;j++){
                System.out.print(b[i][j]+" ");
                
                
            }
            System.out.println(" ");
            
        }
        System.out.println("multiplication of matrix");
        
    
        for(i=0;i<3;i++){
            for( j=0;j<3;j++)
            {for(int k = 0; k <3; k++)
            {
            c[i][j] = c[i][j] + a[i][k] * b[k][j];
            }
            }
            }

            for (i = 0; i < 3; i++)
            {
            for(j = 0; j < 3; j++)
            {
            System.out.print(c[i][j] + " ");
            }
            System.out.println();
            }
        
        
    }
}
