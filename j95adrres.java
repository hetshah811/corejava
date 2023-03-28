import java.util.Scanner;

public class j95adrres {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter Adrees:");
    String Adrees =sc.nextLine();
    if(Adrees.length()<10){
        System.out.println("Adress length should be greter than 10");
    }else{
        System.out.println(Adrees);
    }
        
    }
}
