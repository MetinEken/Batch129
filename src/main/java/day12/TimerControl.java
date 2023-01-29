package day12;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimerControl {
    static int sayac=0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Timer myTimer=new Timer();
        TimerTask gorev =new TimerTask() {


            @Override
            public void run() {

                System.out.println("Merhaba");
                sayac++;
                String cevap = input.next();
                if(sayac==5)
                    myTimer.cancel();
            }
        };

        myTimer.schedule(gorev,0,3000);
    }
}
