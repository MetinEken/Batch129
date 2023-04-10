package yazBoz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AracObje {



    List<Date> tarih2 = new ArrayList<>();


    public void ekleme(){
        Date simdi = new Date();
        List<Date> tarih1 = new ArrayList<>(); // 11.01.23, 12.01.23 //== 12.01.23 .....

        Arac arac1= new Arac("BMW","220",tarih1);

    }
}
