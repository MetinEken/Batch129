package hastaneOtomasyon.hastaneVeriSistemi;

import hastaneOtomasyon.model.Doktor;
import hastaneOtomasyon.model.Hasta;

import java.util.ArrayList;
import java.util.List;

public class HastaneVeriBankasi {

    static List<Doktor> doktorlar = new ArrayList<>();
    static List<Hasta> hastalar = new ArrayList<>();


    public static void addDoktor(){
        Doktor doktor1 = new Doktor("Ali ","ihsan",35,"Dahiliye","123445");
        Doktor doktor2 = new Doktor("Ali ","ihsan",35,"Cerrahi","1234456");
        Doktor doktor3 = new Doktor("Ali ","ihsan",35,"Noroloji","1234457");
        Doktor doktor4 = new Doktor("Ali ","ihsan",35,"Noroloji","123445");
        Doktor doktor5 = new Doktor("Ali ","ihsan",35,"Dahiliye","123445");
        Doktor doktor6 = new Doktor("Ali ","ihsan",35,"Psikiyatri","123445");
        Doktor doktor7 = new Doktor("Ali ","ihsan",35,"KBB","123445");

        doktorlar.add(doktor1);
        doktorlar.add(doktor2);
        doktorlar.add(doktor3);
        doktorlar.add(doktor4);
        doktorlar.add(doktor5);
        doktorlar.add(doktor6);
        doktorlar.add(doktor7);
    }

    public static void printDoktor(){
        for (Doktor w:doktorlar ) {
            System.out.println(w);
        }
    }

    public static List<Doktor> getDoktorlar(String y){
    List<Doktor> bolumDoktorlari = new ArrayList<>();
        for (Doktor w: doktorlar ) {
            if (w.getBolum().equals(y)){
                bolumDoktorlari.add(w);
            }
        }
        return bolumDoktorlari;
    }
}
