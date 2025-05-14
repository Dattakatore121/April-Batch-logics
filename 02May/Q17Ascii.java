import java.util.Scanner;

public class Q17Ascii {
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your number:");
        int n=scanner.nextInt();
        System.out.print("Enter your Character:");
        char ch =scanner.next().charAt(0);

        int start=(int)ch;
        int end=start+n;

        while(start<=end){
            System.out.println((char)start);
            start++;
        }
    
    
}
}
