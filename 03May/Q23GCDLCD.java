import java.util.Scanner;
public class Q23GCDLCD {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your number a:");
         int a=scanner.nextInt();
         System.out.print("Enter your number b:");
         int b=scanner.nextInt();

         int gcd=1;
         int i=1;
         while(i<=a|| i<=b){
            if(a%i==0 && b%i==0){
                gcd=i;
            }i++;

         }System.out.println("gcd :"+gcd);
         double lcm=(a*b)/gcd;
         System.out.println("LCM =" +lcm);


         
    }
    
}
