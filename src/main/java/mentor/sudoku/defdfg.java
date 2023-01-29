package mentor.sudoku;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class defdfg {
    public static void main(String[] args) {

        Date dfd = new Date();
        System.out.println(dfd);
        LocalDateTime date = LocalDateTime.now();
        LocalDate  asa = LocalDate.now();
        System.out.println(date);
        System.out.println(asa);
        LocalTime time = LocalTime.now();
        System.out.println(time);

       /// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
       // LocalDateTime date2 = LocalDateTime.now().format(formatter);
       // System.out.println(date2);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");




    }
}
