package arrrayAndList;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListDersAnlatim {
    // list lere ornek olarak : list e kisi ekleyelim, kisinin ismi soyismi, dogum tarihi, yasadigi yer.. gibi seyleri yazalim. bunlarida split mtodu ile ayrstiralim
    // 1 sirada ismi
    // 2. sirada soyismi gibi
    // bos olan bilgilere ise null ekleyelim
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        String isim= "ali";
        String soysim ="yilmaz";
        String date2 = time.format(myFormat);
        System.out.println(isim);
        System.out.println(soysim);
        System.out.println(date2);
        String user1= isim+" "+soysim+" "+date2;
        str.add(user1);
        String user2= isim+"2 "+soysim+"2 "+date2;
        str.add(user2);
        System.out.println(str.toString());
        int sayi=1;
        for (String w: str) {
            System.out.println(sayi+". ogrenci : ");
            String x=w;
            System.out.println(x);
            String[] y= x.split(" ",0);
            for (int i=0; i<y.length; i++){
                System.out.println();
            }
//            String isim1= String.valueOf(w.toString().split(" ", 1));
//            System.out.println("isim : "+w.toString().split(" ",0).toString());
//            System.out.println("soyisim : "+w.toString().split(" ",1).toString());
//            System.out.println("tarih : "+w.toString().split(" ",2).toString());
//            System.out.println(isim1);
            sayi++;
        }
        for (int i=0; i<str.size(); i++){
           String[] isim3= str.get(i).split(" ", 0);

            System.out.println(isim3);
        }

        // olusturulan ogrencileri bir array de saklayalim



    }
}
