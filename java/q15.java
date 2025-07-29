import java.util.Scanner;

class q15{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        int Salary = scan.nextInt();
        System.out.println("Enter your age :");
        int Age = scan.nextInt();
        
        if(Salary >= 20000 || Age<=25){
          System.out.println("Eligible for loan");
          System.out.println("Enter your Loanamount :");
          int Loanamount=scan.nextInt();
          scan.nextLine();
           
           if(Loanamount<50000){
            System.out.print("Loan Available");
           }
           else{
            System.out.print("Maximum limit is 50000");
           }
        }
        else{
            System.out.print("no loan");
        }
    }

}