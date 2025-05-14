import java.util.Scanner;
public class Helloworld {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter yout number :");

        int num=scanner.nextInt();

        for(int i=1; i<=num; i++ ){

            System.out.println("Hello world datta");
        }
    }
    
}
