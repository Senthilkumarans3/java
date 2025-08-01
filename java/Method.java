public class Method{
     void sum(int a,int b){
        System.out.println(a+b);
     }
     void sum(int a,int b, int c){
        System.out.println(a+b+c);
     }

    public static void main(String args[]){

      Method obj=new Method();
      obj.sum(2,3);
      obj.sum(1,2,3);

    }
}