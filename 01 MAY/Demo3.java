import java.util.Scanner;
public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    System.out.println("Enter yur charter :");
        char ch=scanner.next().toLowerCase().charAt(0);

        if(ch=='a'|| ch=='e'||ch=='u'||ch=='o'||ch=='u'){
            System.out.println("It is vowel");
        }else{
            System.out.println("it is not vowel");
        }

        System.out.println(ch);
    }
    
}
