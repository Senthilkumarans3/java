import java.util.Scanner;

class q26{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[] score = new int[5];

        for(int i=0;i<=4;i++){
            score[i]=scan.nextInt();
            
        }
         for(int i=0;i<=4;i++){
            System.out.println(score[i]);
         }
       
    }
}