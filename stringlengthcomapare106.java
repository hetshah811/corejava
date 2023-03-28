import java.util.Scanner;

public class stringlengthcomapare106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string1:");
        String str=sc.nextLine();
        System.out.println("enter string2");
        String str2=sc.nextLine();


     if(str.length()>str2.length()){
        System.out.println(str+"first  string is grether than second string"+str2);
     }else{
        System.out.println(str2+"is grether than"+str);
     }



    }
}
