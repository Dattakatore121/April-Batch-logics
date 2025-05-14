import java.util.Scanner;

public class Charter1 {
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    System.out.println("Enter yur charter :");
        char ch=scanner.next().charAt(0);

       

       if(Character.isUpperCase(ch)){
        System.out.println ("is uppercase");

       }else if(Character.isLowerCase(ch)){
        System.out.println("it is lowercase");
       }else{
        System.out.println("SPecial character");
       }
    }
    
    
}
