package hastaneOtomasyon.hastaMenu;

import hastaneOtomasyon.HastaneMenu;
import hastaneOtomasyon.hastaneVeriSistemi.HastaneVeriBankasi;
import hastaneOtomasyon.model.Doktor;
import hastaneOtomasyon.saglikBakanligiVeriSistemi.VatandasBilgiSistemi;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HastaMenu  {

    public static void hastaMenu() {
        VatandasBilgiSistemi kisi = new VatandasBilgiSistemi();
        Scanner input = new Scanner(System.in);
        System.out.println("Hosgeldini");
        System.out.println("= Lutfen T.C. Kimlik Numaranizi Giriniz!");
        System.out.println("Cikis icin 'Q' ya basiniz");
        String kimlikNo = input.next().toUpperCase().trim();
        VatandasBilgiSistemi hasta = kisi.getVatandas(kimlikNo);
        if (kimlikNo.equals("Q") ) {
            HastaneMenu.hastaneMenu();
       }else if (kisi == null){
            System.out.println("Yanlis yada eklisk giris yaptiniz tekrar deneyiziz");
            hastaMenu();
        } else {System.out.println("Hosgeldiniz "+hasta.getName()+" "+hasta.getLastNAme());}

        boolean cikis=true;
        do {
            System.out.println("Lutfen gitmek istediginiz bolumu seciniz");
            System.out.println("KBB icin 'K' ya basiniz");
            System.out.println("Dahiliye icin 'D' ya basiniz");
            System.out.println("Noroloji icin 'N' ya basiniz");
            System.out.println("Genel Cerrahi icin 'G' ya basiniz");
            System.out.println("Cikis icin 'Q' ya basiniz");
            String secim = input.next().toUpperCase().trim().substring(0,1);
            if (!secim.equals("Q")){
            switch (secim){
                case"K":
                    List<Doktor> doktor1 = HastaneVeriBankasi.getDoktorlar("KBB");
                    print(doktor1);
                    doktorSec(doktor1);
                    break;
                case"D":
                    List<Doktor> doktor2 = HastaneVeriBankasi.getDoktorlar("Dahiliye");
                    print(doktor2);
                    break;
                case"N":
                    List<Doktor> doktor3 = HastaneVeriBankasi.getDoktorlar("Noroloji");
                    print(doktor3);
                    break;
                case"G":
                    List<Doktor> doktor4 = HastaneVeriBankasi.getDoktorlar("Genel Cerrahi");
                    print(doktor4);
                    break;
                default:
                    System.out.println("YANLIS SECIM YAPTINIZ TEKRAR DENEYINIZ");
                    break;
            }}

        }while (cikis);
    }

    private static void doktorSec(List<Doktor> doktor1) {
        System.out.println("doktor sec");
    }

    public static void print(List<Doktor> doktor){
        for (Doktor w: doktor ) {
            System.out.println(doktor);
        }
    }
}
