import java.util.Scanner;

class q2{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      String name = scan.nextLine();
      int age = scan.nextInt();
      scan.nextLine();
      String place= scan.nextLine();
      System.out.println("My name is "+name);
      System.out.println("My age is "+age);
      System.out.print("I am from "+place);
    }
}
