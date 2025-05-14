
import java.util.Scanner;
public class Addtion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your number");
        int num=scanner.nextInt();
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            sum/=10;
        }


        System.out.println(sumum);
    }
    
}
