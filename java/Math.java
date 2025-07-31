public class Math{

    void sub(int a,int b){
        System.out.println(a-b);
    }
    void mul(int a,int b){
        System.out.println(a*b);
    }
    void div(int a,int b){
        System.out.println(a/b);
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String args[]){
        Math obj1=new Math();
        obj1.sub(3,3);
        obj1.add(3,3);
        obj1.mul(3,3);
        obj1.div(3,3);
    }
}