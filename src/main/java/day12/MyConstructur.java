package day12;

import arrrayAndList.Ogrenci;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyConstructur {
    int x =3;
    int y = 5;

    MyConstructur(){
        x+=1;
        System.out.println("1 -x"+x);
    }
MyConstructur(int i){
        this();

        this.y=i;
        x +=y;
    System.out.println("2 -x"+x);
}
MyConstructur(int i, int i2){
        this(3);

        this.x-=4;
    System.out.println("3 -x"+x);
}

    public static void main(String[] args) {
        MyConstructur mc1 = new MyConstructur(4,3);




    }

}
