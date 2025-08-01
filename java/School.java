import java.util.Scanner;

public class School{
    String passorfail(int score)
    {
     if(score<35){
        return "Fails";
     }
     else{
        return "Pass";
     }
    }

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int totalmark=scan.nextInt();
        School obj1=new School();
        String result=obj1.passorfail(totalmark);
        System.out.println(result);
    }
}