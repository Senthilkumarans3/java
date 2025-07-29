import java.util.Scanner;

class q20{
         public static void main(String args[])
         {
            Scanner scan=new Scanner(System.in);
            System.out.println("a:");
            int a = scan.nextInt();
            System.out.println("b:");
            int b = scan.nextInt();

            for(int i=a;i<=b;i=i+1){
                System.out.println(i);
            }
         }
}