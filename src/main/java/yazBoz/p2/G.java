package yazBoz.p2;

public class G {
    int x=3;
    int y=5;
    G(){
        x+=1;
        System.out.println("-x"+ x);
    }
    G(int i){
        this();
        this.y=i;
        x+=y;
        System.out.println("-x"+x);
    }
    G(int i, int i2){
        this(3);
        this.x-=4;
        System.out.println("-x"+x);
    }

    public static void q(){

    }
    public void f(){

    }
    public  static void w(){
        //  f();
        q();
    }

    public static void main(String[] args) {
        G t = new G(4,3);
        t.w();
        G c= null;
        c.w();

    }





}
