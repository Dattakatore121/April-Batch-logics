import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Number :");
        int num=scanner.nextInt();

        while(num <=10 ){
            System.out.println( "i ="+num);
            num++;
        }
    }
    
}
