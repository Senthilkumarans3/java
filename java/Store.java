public class Store{
     void getchoclate(int money){
        System.out.println(money);
         System.out.println("Choclate purchased");

     }    
     void getpowder(int money){
         System.out.println(money);
        System.out.println("powder purchased");
     }

    public static void main(String args[]){
          Store obj1=new Store();
          obj1.getpowder(50);
          obj1.getchoclate(20);
    }
}