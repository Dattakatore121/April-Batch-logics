import java.util.Scanner;

public class Q3Reverse {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your number :");
         int n=scanner.nextInt();

         int num=n;
        int rev=0;
         System.out.println("Original number" +num);
         while(n>0){
            int digit=n%10;
            rev=(rev*10)+digit;
            //System.out.println(digit);
            n/=10;
         }System.out.println("Reverse number"+rev);
        
         


         
    }
    
}