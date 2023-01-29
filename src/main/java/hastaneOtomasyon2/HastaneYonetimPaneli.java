package hastaneOtomasyon2;

import java.util.Scanner;

public class HastaneYonetimPaneli {
    public static void yonetimMenu() {
        Scanner input = new Scanner(System.in);

        boolean devam=true;
       //USERnAME VE PASSWORD SORGLAMA

        do {

            System.out.println(" ========= HASTENE YONETIM PANELINE HOSGELDINIZ ========");
            System.out.println("    DOKTOR LISTESI ICIN 'D' YE BASINIZ");
            System.out.println("    DOKTOR EKLEME ICIN 'E' YE BASINIZ");
            System.out.println("    DOKTOR UPDATE ICIN 'U' YE BASINIZ");
            System.out.println("    CIKIS ICIN 'Q' YA BASINIZ");
            String secim = input.next().trim().toUpperCase().substring(0,1);

            switch (secim){
                case"D":
                    //LISTELE();
                    break;
                case"E":
                   //  //EKLE();
                    break;
                case"U":
                    //  //UPDATE();
                    break;
                case "Q":
                    devam=false;
                    break;
                default:
                    System.out.println("yanlos secim tekrar deneyin");
            }

        }while (devam);

    }
}
