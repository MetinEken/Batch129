package day12;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;

public class deneme {
    public static void main(String[] args) {

            LocalDateTime myDateObj = LocalDateTime.now();
            System.out.println("Before formatting: " + myDateObj);
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ss.ms");
        System.out.println("ilk hali : "+myFormatObj);
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("After formatting: " + formattedDate);
          //  long x = 100+Long.parseLong(formattedDate);
            double y =3.000+ Double.parseDouble(formattedDate);
        Clock cl = Clock.systemUTC();
        System.out.println(cl.toString());
        System.out.println("son hali : "+'\n'+"   "+y);
        LocalTime time = LocalTime.now();
        LocalTime time2 = LocalTime.now();
        System.out.println(time.isAfter(time2));

        int x[] = new int[3];
        x[0] =4;

        int yt[] = new int[1];
        yt[0]=4;
//        yt[1]=5;
//        yt[2]=6;
        System.out.println(Arrays.toString(yt)); // 4 yazdirdi
        // lengt den fazla ekleme yaptigimiz icin runTime exception verdi

    //    String df= 34; //compile time error budur


    }
}
