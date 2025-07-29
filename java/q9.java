import java.util.Scanner;

class q9{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int Variables = scan.nextInt();
        if(Variables >= 7000){
            System.out.print("Eligible for scholarship");
        }
        else{
            System.out.print("Not eligible ");
        }
    }
    
}