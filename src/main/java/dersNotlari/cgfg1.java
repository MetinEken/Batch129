package dersNotlari;

import java.util.ArrayList;
import java.util.List;

public class cgfg1 {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("sdsdfsd");
        str.add("sdsdfsd1");
        str.add("sdsdfsd2");
        str.add("sdsdfsd3");
        str.remove("sdsdfsd");

//int i=0;
//        for (String w: str) {
////            str.set(i,"s");
////            i++;
//            str.remove(i);
//            i++;
//        }
  //      System.out.println(str);
        Long time=System.currentTimeMillis();
        System.out.println("started!!!!!!!!!!!");
        System.out.println(time);
        for (int i=0; i<13000; i++){
          if (str.get(2).equals("asdf")){
              System.out.println("true");
          }
            System.out.print(".");
        }
        Long time2=System.currentTimeMillis();
        System.out.println("ended!!!!!!!!!!!");
        System.out.println(time2);
        System.out.println(time2-time);
    }
}
