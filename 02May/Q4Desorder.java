import java.util.Scanner;

public class Q4Desorder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your end:");
        int i=scanner.nextInt();
        System.out.print("Enter your start:");
        int n=scanner.nextInt();
    

        while(i <=n){
            System.out.println( "i = "+ i);
            i--;
        }
    }
    
   
}
