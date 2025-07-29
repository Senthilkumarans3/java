import java.util.Scanner;

class q14{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String color = scan.nextLine();

        if(color.equals("red"))
        {
            System.out.print("Stop");
        }
        else if(color.equals("yellow"))
        {
            System.out.print("Get ready");
        }
        else 
        {
            System.out.print("Go");
        }
    }
    
}