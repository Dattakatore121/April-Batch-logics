import java.util.Scanner;

public class Q19primenumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your number:");
        int n=scanner.nextInt();

        boolean isPrime=true;
        int i=2;
        while(i<n){
            if(n%i==0){
                isPrime=false;
                break;
            }i++;
        }
        if(isPrime){
            System.out.println(n + "is prime");
        }else{
            System.out.println(n + "is not prime");
        }

         


       
        }
    
    
}

    

