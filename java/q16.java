import java.util.Scanner;

class q16{
    public static void main(String args[]){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter your A value");
     int a = scan.nextInt();

     System.out.println("Enter your B value");
     int b = scan.nextInt();

     String c =(a>b)? "A is greater":"B is greater";

     System.out.print(c);
    }
}