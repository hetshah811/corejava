import java.util.Scanner;

import javafx.scene.transform.Scale;

public class j4AreaofCircle {
    public static void main(String args[]){
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int :");
        r=sc.nextInt();
        System.out.println("Area of Circle : "+(3.14*r*r) );
    }
}

//3.14*r*r