package mentor.JavaOyunMatematik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DortIslemOyunuV2 {

    // oyuncu 4 islem oyunna giris yapip ayuna basladiginda Rastgele sayilar uretilip, rastgele 4 islemden birisi secilip oyuncuya soru soruluyor
    // Rastgele sayilar belirlenmesi, rastgele 4 islemden birinin secilmesi Bir method icerisinde do-while loopp icerisinde gerceklesiyor
    // soru ekrana gelir gelmez bilgiler cevapKontrol() methoduna aktariliyor.
    // cevapKontrol() methodu verilen bilgilerle dogru cevabi kontrol ediyor ve oyunMain() methoduna 2 cevap gonderiyor. Hata sayisi ve toplam puan
    // 2 cevabi birden alabilmemiz icin bu cevaplari bir List icersinde tek bir objeymis gibi gonderiyoruz.
    // gelen cevap bir list oldugu icin icersinden 0'inci indexden hatayi, 1'inci indexten ise puan durumunu aliyoruz.
    // once cevaplari torbaya(List'e) koyuyoruz, sonra da torbadan cikariyoruz
    // hata sayisi 3 olmussa oyun bitiyor, degilse oyun do-while loop icinde devam ediyor

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("DEV04 SAYISAL ZEKA-2 OYUNUNA HOSGELDINIZ");
        System.out.println("LUTFEN KULLANICI ADINIZI GIRINIZ");
        String userName = input.next().toUpperCase().trim();
        int puan =0;
        System.out.println("  ==== HOSGELDIN : "+ userName +" ====");
        System.out.println("  ==== PUANIN    : "+ puan);
        //
        // anaMenu();


        do {

            System.out.println(" PLAY  = Y");
            System.out.println(" CIKIS = Q");
            String secenek = input.next().toUpperCase().trim();
            switch (secenek){
                case "Y":
                    System.out.println(oyunMain(userName, puan));
                    break;
                case "Q":
                    break;
            }
        } while (true);
    }


    // ======== OYUNUMUZU BURADA YAZDIK =========
    private static String oyunMain(String userName, int puan) {
        Scanner input = new Scanner(System.in);
        int hata=0;

        do {

            int sayi1 = (int) (Math.random()*100); // 4 ISLEMDE KULLANILACAK SAYILARDAN 1.SI
            int sayi2 = (int) (Math.random()*50); // 4 ISLEMDE KULLANILACAK SAYILARIN 2.SI
            int sayi3 = (int) (Math.random()*10);
            int sayi4 = (int) (Math.random()*10);
            int sayi5 = (int) (Math.random()*4); // BU HANGI ISLEMI BIZE GETIRECEGINI RATSTGELE SECECEK


// altta yarismaciya hangi 4 islem soracagi rastgele belirlenir. sayi5 den gelen rastgele sayi swich case de yakalanir.
// hangi case yakalamis ise once sorusunu ekrana yazdiri daha sonra cevapKontrol() isimli methoda yonlendirir,
// cevapKontrol() methodundan gelen cevaba gore yarismaci oyuna devam eder
            Long sn1 = System.currentTimeMillis(); // soru ekrana gelir gelmez guncel mili saniye alinir, sn1 objesi icerisine kaydedilir
    switch (sayi5){
        case 0:
            System.out.println("  SORU  =  "+sayi2+ " + "+ sayi3+"  =  ?" );    // TOPLAMA ISLEMI

         List<Integer> gelenCevap=    cevapKontrol(sayi2,sayi3, sn1, hata, puan, sayi5, sayi4, sayi1); // cevabi kontrol edecek methoda islem yapilacak sayilar(sayi2,sayi3) ve baslama zamani gonderilir(sn1).
           hata = gelenCevap.get(0);
           puan = gelenCevap.get(1);
            break;                                 // ayrica hata oyuncunun hatabilgisi de gider, oyuncunun oyuna devam edip etmeyecegine karar orda verilir. istersek karari swich case icersinde de verebiliriz
        case 1:
            System.out.println("  SORU  =  "+sayi1+ " - "+ sayi2+"  =  ?" );    // CIKARMA ISLEMI
             gelenCevap=    cevapKontrol(sayi2,sayi3, sn1, hata, puan, sayi5, sayi4, sayi1);
            hata = gelenCevap.get(0);
            puan = gelenCevap.get(1);
           break;
        case 2:
            System.out.println("  SORU  =  "+sayi2+ " * "+ sayi3+"  =  ?" );    // CARPMA ISLEMI
             gelenCevap=    cevapKontrol(sayi2,sayi3, sn1, hata, puan, sayi5, sayi4, sayi1);
            hata = gelenCevap.get(0);
            puan = gelenCevap.get(1);
            break;
        case 3:
            System.out.println("  SORU  =  "+sayi2+ " / "+ sayi3+"  =  ?" );    // BOLME ISLEMI
             gelenCevap=   cevapKontrol(sayi2,sayi3, sn1, hata, puan, sayi5, sayi4, sayi1);
            hata = gelenCevap.get(0);
            puan = gelenCevap.get(1);
            break;
    }

     }while (hata<3);

        String sonuc = " ======================================== " +'\n'+
                       " =============== GAME OVER ===============" +'\n'+
                "KULLANICI ADI : "+ userName+'\n'+
                "PUANINIZ      : "+ puan;
        return sonuc;
    }


    // cevapKontrol methodu asagida yazildi. bircok bilgiyi methoda gonderdik, bu bilgilerin hepsini kullanip 2 cevap verecek
    // 1cevap hata sayusis, oyuna devam edip etmeyecegine bununla karar verecegiz
    // 2.cevap puan'i,
    private static List<Integer> cevapKontrol(int sayi2, int sayi3, Long sn1, int hata, int puan, int sayi5, int sayi4, int sayi1) {
        List<Integer> cevapKutusu = new ArrayList<>();
        cevapKutusu.add(0); // bos olan list e ilk elemanlari atamaliyiz, asagida her seferinde set() methodunu kullanacagiz
        cevapKutusu.add(0); // herdefasinda asagida add() methodunu kullanirsak, son hata ve puan durumunun indexi surekli artarak degisir.
                            // biz her zaman hata durumunun index-0 da, puan durumunun ise index-1 de olmasini istiyoruz
        Scanner input = new Scanner(System.in);
        int cevap = input.nextInt();
        Long sn2 = System.currentTimeMillis(); // cevap verilince tekrar guncel zaman milisaniye cinsinden aliniyor // if icerisinde zaman karsilastirmasi yapilir

        int dogruCevap=0;
        // dogru cevap 4 isleme gore degisebilecegi icin uzun uzun dogru cevap kontrolu yapmaktansa dogru cevabi burda buluoruz
        if (sayi5 == 0){
            dogruCevap=sayi2+sayi3;
        } else if (sayi5 ==1) {
            dogruCevap=sayi1-sayi2;
        } else if (sayi5 ==2) {
            dogruCevap=sayi2*sayi3;
        } else if (sayi5 == 3) {
            dogruCevap=sayi2/sayi3;
        }
        // dogrucevap lar yukarda belirleniyor artik
        if ((dogruCevap == cevap) && (sn1+5000 > sn2)){
            System.out.println(" ===== DOGRU CEVAP =====");
            puan=puan+10;
            System.out.println(" PUANINIZ      : "+puan);
            System.out.println(" KALAN CANINIZ : "+(3-hata));
            System.out.println(" SURE          : "+ ((sn2-sn1)/1000) +" saniye");
            cevapKutusu.set(0,hata); // 0 index de hataDegeri var // add() kullanmamaliyiz
            cevapKutusu.set(1,puan);  // 1 index de puan var  // eski degeri degistirmekisyorsak set() kullailmali
        }else if(dogruCevap == cevap && (sn2>(sn1+5000))){
            System.out.println(" ===== DOGRU CEVAP AMA ZAMAN ASIMI :((( =====");
            System.out.println(" PUANINIZ : "+puan);
            hata++;
            System.out.println(" KALAN CANINIZ : "+(3-hata));
            System.out.println("ZAMAN ASIMI : "+ ((sn2-sn1)/1000)+" saniye");
            cevapKutusu.set(0,hata);
            cevapKutusu.set(1,puan);
        } else if (dogruCevap != cevap) {
            System.out.println(" ===== YANLIS CEVAP ====");
            System.out.println(" DOGRU CEVAP = " +dogruCevap );
            System.out.println(" SURE = "+ ((Double.parseDouble(String.valueOf(sn2-sn1))/1000)) +" saniye");
            hata++;
            System.out.println(" KALAN CANINIZ : "+(3-hata));
            cevapKutusu.set(0,hata);
            cevapKutusu.set(1,puan);
        }
        return cevapKutusu;  // ayni anda 2 cevabi gonderemiyoruz. ilerleyen derskerde gonderebiliriz
    }
}

