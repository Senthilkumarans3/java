public class Laptop{
    String name="";
    String proc="";
    int  price=0;

    public static void main(String args[]){

        Laptop lap1=new Laptop();

        lap1.name="hp";
        lap1.proc="i7";
        lap1.price=10000;

        Laptop lap2=new Laptop();

        lap2.name="lenovo";
        lap2.proc="i5";
        lap2.price=20000;     

        System.out.println(lap1.price);

        System.out.println(lap2.proc);
    }

}