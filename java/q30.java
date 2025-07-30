import java.util.Scanner;

class q30{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] mark= new int[size];

        for(int i=0;i<=size-1;i++)
        {
            mark[i]=scan.nextInt();
        }
        {
            System.out.print(mark[3]);
        }
        
    }
     
}