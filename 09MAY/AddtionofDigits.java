import java.util.Scanner;

public class AddtionofDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your Number :");

     int num=scanner.nextInt();

      int sum =0;

     for(int i=1;i<=num; i++){

         sum =sum +i;
        
    
}
System.out.println(sum);
    }
}
