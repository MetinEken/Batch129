package hastaneOtomasyon2;

import java.util.Scanner;

public class HastaneAnaMenu {


    public static void anaMenu() {
        Scanner input = new Scanner(System.in);

        boolean devam=true;
        do {

        System.out.println(" ========= HASTENEMIZE HOSGELDINIZ ========");
        System.out.println("    HASTA RANDEVU ISLEMLERI ICIN 'H' YE BASINIZ");
        System.out.println("    HASTANE YONETIM PANELI ICIN 'Y' YE BASINIZ");
        System.out.println("    CIKIS ICIN 'Q' YA BASINIZ");
        String secim = input.next().trim().toUpperCase().substring(0,1);

        switch (secim){
            case"H":
                HastaMenu.hastaMenu();
                break;
            case"Y":
                HastaneYonetimPaneli.yonetimMenu();
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
