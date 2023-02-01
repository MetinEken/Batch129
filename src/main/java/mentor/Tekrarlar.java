package mentor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Tekrarlar {
    public static void main(String[] args) {

//        //Iterator
//        List<String> list1 = new ArrayList<>();
//        list1.add("Ali");
//        list1.add("Can");
//        list1.add("Aliye");
//        System.out.println(list1);
//
//        Iterator<String> itr1 = list1.iterator();
//
//        while (itr1.hasNext()) {
//            itr1.next();
//            itr1.remove();
//        }
 //       System.out.println(list1);// []
        Date date = new Date();
        LocalDate datee = LocalDate.now();
        System.out.println(date +" === "+datee);
    }
}