import java.util.Scanner;
public class Q21Demo{
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your number :");
         int num=scanner.nextInt();

         System.out.println("Number :" +num);
         int a=num%10;
         num/=10;
         int b=num%10;
         num/=10;
         int c=num%10;
        


         System.out.println( "a=" +a);
         System.out.println( "b=" +b);
         System.out.println( "c=" +c);

         if(a+c==b){
            System.out.println("condition satisfied");
         }else {
            System.out.println("condition not satisfied");
         }
    }
}