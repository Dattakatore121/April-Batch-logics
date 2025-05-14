
import java.util.Scanner;
public class Q41TicketCalculate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scanner.nextInt();
        System.out.println("1.Monday ");
        System.out.println("2.Tuesday ");
        System.out.println("3.wenesday ");
        System.out.println("4.Thiresday ");
        System.out.println("5.Fridayday ");
        System.out.println("6.Saturday ");
        System.out.println("7.Sanday ");
        System.out.print("Enter your day:");

        int day=scanner.nextInt();
        if(day>=1&& day<=5){
            System.out.println("weekday");
        if(age<=13){
            System.out.println("Ticket price: 100 RS");
        }else if(age>13 && age<=65){
            System.out.println("tIcket price : 150Rs");
        }else {
            System.out.println("Iicket Price :130 Rs");
        }
    }
        else{
            System.out.println("weekend");
        if(age<=13){
            System.out.println("Ticket price: 120 RS");
        }else if(age>13 && age<=64){
            System.out.println("tIcket price : 180Rs");
        }else{
            System.out.println("Iicket Price :150 Rs");

        }
        }
    }

}



    
    
    

