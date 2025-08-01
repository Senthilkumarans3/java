public class Details{
    String getname(){
        return "Sk";
    }
    String getphone(){
        return "iphone";
    }
    String getaddress(){
        return "Attur";
    }

    public static void main(String args[]){
        Details obj1=new Details();
        String myname = obj1.getname();
        System.out.println(myname);

        String myphone=obj1.getphone();
        System.out.println(myphone);

        String myaddress=obj1.getaddress();
        System.out.println(myaddress);


    }
}