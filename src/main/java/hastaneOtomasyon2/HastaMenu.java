package hastaneOtomasyon2;

import java.util.Scanner;

public class HastaMenu {

    public static void hastaMenu() {
        Scanner input = new Scanner(System.in);

        boolean devam=true;
        do {

            System.out.println(" ========= HASTA MENUSUNE HOSGELDINIZ ========");
            System.out.println("    RANDEVU ALMAK ICIN 'R' YE BASINIZ");
            System.out.println("    RANDEVULARINIZI GORMEK 'G' YE BASINIZ");
            System.out.println("    CIKIS ICIN 'Q' YA BASINIZ");
            String secim = input.next().trim().toUpperCase().substring(0,1);

            switch (secim){
                case"R":
                   // RANDEVUISLEMLER();
                    break;
                case"G":
                    //RANDEVUGOSTER();
                    break;
                case "Q":
                    devam=false;
                    break;
                default:
                    System.out.println("yanlIs secim tekrar deneyin");
            }

        }while (devam);
    }
}
