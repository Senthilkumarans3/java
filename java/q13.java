import java.util.Scanner;

class q13{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int Tamil= scan.nextInt();
        int English=scan.nextInt();
        int Maths=scan.nextInt();
        int Science=scan.nextInt();
        int Social=scan.nextInt();

        int total = Tamil + English + Maths + Science + Social;
        int average=(total / 5);

        if(average < 35){
            System.out.print("Additional clas required");
        }
        else{
            System.out.print("You're good to go");
        }

    }
}