import java.util.Scanner;

class q1{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a == b){
            System.out.print("Equal");
        }
        else{
            System.out.print("not equal");
        }
    }
}