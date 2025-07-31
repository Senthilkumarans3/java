import java.util.Random;

class q34{
    public static void main(String args[])
    {
        Random numb=new Random();
        int newnum=0;
        

        while(newnum!=5)
        
        {
            newnum=numb.nextInt(11);
            System.out.println(newnum);
        }
    }
}