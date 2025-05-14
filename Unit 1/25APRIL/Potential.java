import java.util.Scanner;
 public class Potential{
    public static void main(String[] args) {
        
Scanner scanner=new Scanner(System.in);
System.out.print("Enter your length  :");
double length= scanner.nextDouble();

System.out.print("Enter your bradth  :");
double bradth= scanner.nextDouble();

double area_of_rectangle=length*bradth;

System.out.println(area_of_rectangle);


    }
 }