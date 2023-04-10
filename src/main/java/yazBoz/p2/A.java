package yazBoz.p2;

public class A {
    int y;
    static int count;
    public A(){
        y++;
        count++;
    }
    public  void increment(){
        count++;
        y++;
    }

    public static void main(String[] args) {
        A obj1 = new A();
      //  A obj2 =new A();

        obj1.increment();
        obj1.increment();
        obj1.increment();
        obj1.increment();

        System.out.println(obj1.count);
        System.out.println(obj1.y);
    }
}
