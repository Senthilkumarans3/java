import java.util.Scanner;

class q6{
    public static void main(String atgs[])
    {
        Scanner scan = new Scanner(System.in);
        String CSK = scan.nextLine();
        if(CSK.equals("WIN")){
            System.out.print("Champions");
        }
        else{
            System.out.print("Still champions");
        }
    }
}