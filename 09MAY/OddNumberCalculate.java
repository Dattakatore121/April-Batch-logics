import java.util.Scanner;
public class OddNumberCalculate {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter your value :");
        int num=sc.nextInt(); 

    

        for(int i=1; i<=num; i++){


            if(  i% 2 ==1){

                System.out.println( i);



            }




        }

        
    }
    
}
