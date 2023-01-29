package hastaneOtomasyon;

import hastaneOtomasyon.hastaMenu.HastaMenu;
import hastaneOtomasyon.hastaneVeriSistemi.HastaneVeriBankasi;
import hastaneOtomasyon.hastaneYonetimPaneli.HastaneYonetimiMenusu;
import hastaneOtomasyon.model.Doktor;
import hastaneOtomasyon.saglikBakanligiVeriSistemi.VatandasBilgiSistemi;

import java.util.List;
import java.util.Scanner;

public class HastaneMenu {
    public static void hastaneMenu() {
        HastaneYonetimiMenusu hastane = new HastaneYonetimiMenusu();
        Scanner input = new Scanner(System.in);
        boolean cikis=true;
        do {
    System.out.println(" ========= HASTENEMIZE HOSGELDINIZ ========");
    System.out.println("    HASTA RANDEVU ISLEMLERI ICIN 'H' YE BASINIZ");
    System.out.println("    HASTANE YONETIM PANELI ICIN 'Y' YE BASINIZ");
    System.out.println("    CIKIS ICIN 'Q' YA BASINIZ");
    String secim=input.next().toUpperCase().trim().substring(0,1);
    switch (secim){
        case"H":
         HastaMenu.hastaMenu();
            break;
        case"Y":
            HastaneYonetimiMenusu.hastaneMenu();
            break;
        case"Q":
            cikis=false;
            break;
    }
//    VatandasBilgiSistemi vatandas = new VatandasBilgiSistemi();
//  // VatandasBilgiSistemi hasta = vatandas.getVatandas(kimlikNo);
//  //  System.out.println("Hosgeldiniz : "+ hasta.getName()+" "+ hasta.getLastNAme());
//    System.out.println("bolum seciniz");
//    System.out.println("doktor seciniz");
//    String X= input.next();
//    //HastaneVeriBankasi.printDoktor();
//    System.out.println("=================");
//    System.out.println("secilen doktor");
//    List<Doktor> doktor = HastaneVeriBankasi.getDoktorlar(X);
//    for (Doktor w: doktor ) {
//        System.out.println(w);
//    }
}while (cikis);
    }
}
