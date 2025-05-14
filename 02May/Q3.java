import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your Start:");
        int i=scanner.nextInt();
        System.out.print("Enter your End:");
        int n=scanner.nextInt();
    

        while(i <=n){
            System.out.println( "i = "+ i);
            i+=50;
        }
    }
    
    
}
