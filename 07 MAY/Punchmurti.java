import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Punchmurti {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your Number :");
        int num=scanner.nextInt();
        int n=num;
        int sum=0;

        while (num>0) {


            int digit= num%10;
            System.out.println( "digit:"+digit);
           int fact=1;
           while(digit>=1){
            fact*=digit;
            digit--;


           }
           sum+=fact;
           num/=10;
            

            
        }
        if(n==sum){
            System.out.println("yes");
        }else{
            System.out.println("NO");
        }        System.out.print(sum);

    }          

}
