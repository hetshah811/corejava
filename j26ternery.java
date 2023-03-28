import java.util.Scanner;

import javafx.scene.transform.Scale;

class Main {
    public static void main(String[] args) {
      
      // create a variable 
      int Age;
      Scanner sc =new   Scanner(System.in);
      System.out.println("Enter yor Age :");
      Age=sc.nextInt();

  
      String result = (Age>=18) ? "you can vote" : "you can't vote";
      System.out.println(result);
    }
  }