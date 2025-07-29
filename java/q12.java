import java.util.Scanner;

class q12{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a < 50){
            System.out.print("You need to improve");
        }
        else if(a>=50 && a<=70){
            System.out.print("Good job");
        }
        else{
            System.out.print("Excellent performance");
        }
    }
}