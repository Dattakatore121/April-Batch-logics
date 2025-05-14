import java.util.Scanner;

public class Q15Facorial {
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your number :");
        int n=scanner.nextInt();

        int i=n;
        int fact=1;
        
    

        while(i >=1){
        fact*=i;
        i--;
            
        } System.out.println( "factorial no of" + n +"is factorial  :" +  fact);

    }
    
}
