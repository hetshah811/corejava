import java.util.Scanner;

public class j36foronesqurecube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("enter number :");
        number=sc.nextInt();
        for(int i=1;i<number;i++)
        {
            System.out.println((i)+"--_"+(i*i)+"--" +(i*i*i));
        }
    }
}
