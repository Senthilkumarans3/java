import java.util.Scanner;

class q27{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int[] numb = new int[10];
        for (int i=0;i<=9;i++){
            numb[i]=scan.nextInt();
        }
        for(int i=0;i<=9;i++){
            System.out.println(numb[i]);
        }
    }
}