import java.util.Scanner;

public class Find{
    void evenorodd(int num)
    {
        if(num%2==0){
          System.out.print("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      int number=scan.nextInt();
      Find obj1=new Find();
      obj1.evenorodd(number);
    }
}