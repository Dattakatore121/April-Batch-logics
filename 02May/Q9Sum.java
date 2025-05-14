import java.util.Scanner;

public class Q9Sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your Start:");
        int i=scanner.nextInt();
        System.out.print("Enter your End:");
        int n=scanner.nextInt();
        int sum=0;
    

        while(i <=n){
        sum+=i;
        i++;
            
        } System.out.println( "sum = "+ sum);

    }
    
}

