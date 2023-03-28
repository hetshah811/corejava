import java.util.Scanner;

public class j31ternerynumbergen {
    public static void main(String[] args) {
        int number1,number2;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        number1=sc.nextInt();
        System.out.println("Enter second number");
        number2=sc.nextInt();

        // String result =
          String result =(number1==number2) ? "numbers are equal" : number1>number2? "number1 is greater"  :"number2 is greater";
         System.out.println(result);
         //System.out.println(result2);

    }
}
