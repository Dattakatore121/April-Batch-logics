import java.util.Scanner;

public class ReversreNumberCalculate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your Number :");

int num=scanner.nextInt();
 

for(int i=num; i>=1; i--){
    System.out.println(i);
}

    }
    
}
