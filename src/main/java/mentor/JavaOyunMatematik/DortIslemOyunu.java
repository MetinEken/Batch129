package mentor.JavaOyunMatematik;

import java.util.Scanner;

public class DortIslemOyunu {
//    == SAYISAL ZEKA OYUNU ==

    // 1.ADIM SADECE OYUNU YAZALIM VE OYNAMA BASLAYALIM

    /*  === KURALLAR ===
     *  MATEMATIK SORUSUNA BELIRTILEN SURE DE CEVAP VER PUANLARI AL
     *  2 DEFA HATA YAPMA HAKKIN VAR, 3. HATA DA OYUNDAN GAMEOVER, PUANLARIN HESAPLANIR, SONUC GOSTERILIR
     *
     * */

    // 2.ADIM OYUNA KAYDOLALIM VE BIR KULLANICI ADIMIZI GIRRELIM. AD ONCEDEN ALINMIS ISE BASKA AD ISTEYELIM
    /* == OYUNA EKLENECEKLER ==
     * 1- OYUNA KAYDOLALIM, KULLANICI ISMI ILE, KULLANICI ADI DAHA ONCE ALINMIS ISE BASKA BIR ISIM GIRELIM,
     *      => DAHA ONCEDEN KAYITLIYSAK " ZATEN UYEYIM " SECENEGINI ISARETLEYELIM ,, BU UZATABILIR
     * 2- OYUN SONUNDA; ILK 3 DE OLAN USER LARIN USERNAME VE PUANLARINI YAZDIRALIM, KENDI SIRALAMAMIZI DA EKLEYELIM
     *
     * */

    // 3. OYUNA ZORLUK DERECESI EKLEYELIM KOLAY-ORTA-ZOR => SURE KISALTILABILIR, RANDOM ARALIGI GENISLETILEBILIR
    /*  === OYUNA EKLENECEKLER ===
     * OYUNU DURDURMAK ISTERSEN P (PAUSE)
     * DEVAM ETMEK ISTERSEN C (CONTINU)
     * TEKRAR OYNAK ISTERSEN Y (YES), CIKIS YAPMAK ISTERSEN Q || N   TUSUNA BASARAK CIKABILIRSIN    *
     *
     * */

    /* == KULLANILACAK DERSLER ==
       1- OBJE OLUSTURMA
       2- METHOD OLUSTURMA VE METHOD CALL (CAGIRMA)
       3-FOR LOOP
       4-FOREACH LOOP
       5-WHILE LOOP
       6-DO WHILE LOPP
       7-ARRAYS
       8-LIST
       9-IF STATEMENT
       10-SWICH CASE
         */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("DEV04 SAYISAL ZEKA OYUNUNA HOSGELDINIZ");
        System.out.println("LUTFEN KULLANICI ADINIZI GIRINIZ");
        String userName = input.next().toUpperCase().trim();
        long puan =0;
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
    private static String oyunMain(String userName, long puan) {
        Scanner input = new Scanner(System.in);
int hata=0;

do {


    int sayi1 = (int) (Math.random()*100); // 4 ISLEMDE KULLANILACAK SAYILARDAN 1.SI
    int sayi2 = (int) (Math.random()*50); // 4 ISLEMDE KULLANILACAK SAYILARIN 2.SI
    int sayi3 = (int) (Math.random()*10);
    int sayi4 = (int) (Math.random()*4); // BU HANGI ISLEMI BIZE GETIRECEGINI RATSTGELE SECECEK

//    switch (sayi4){
//        case 0:
//            System.out.println(oyunMain(userName, puan));
//            break;
//        case 1:
//            status = false;
//            break;
//    }

    System.out.println("  SORU  =  "+sayi2+ " + "+ sayi3+"  =  ?" ); // SORU YARISMACIYA GOSTERILIR


Long sn1 = System.currentTimeMillis(); // soru ekrana gelir gelmez guncel mili saniye alinir, sn1 objesi icerisine kaydedilir

    int cevap = input.nextInt(); // KULLANICNIN BIR SAYI GIRMESI ISTENIR


    Long sn2 = System.currentTimeMillis(); // cevap verilince tekrar guncel zaman milisaniye cinsinden aliniyor // if icerisinde zaman karsilastirmasi yapilir
//    System.out.println("saniye1 = "+sn1);
//    System.out.println("saniye2 = "+sn2);
// IF IF-ELSE STATEMENT LAR ILE DOGRU CEVABI VE SURE KARSILASTIRILIR, KULLANICIYA CEVAP VERIIR, PUAN VERILIR, YADA GAME OVER

   if ((sayi2+sayi3) == cevap && (sn1+5000)>sn2) { //y+5.000 = ilk alinan saniyenin uzerine 5 saniye eklemek demek, aslinda bu mantiksal hatali. bu duzeltilecek
       System.out.println(" ===== DOGRU CEVAP =====");
       puan=puan+10;
       System.out.println(" PUANINIZ      : "+puan);
       System.out.println(" KALAN CANINIZ : "+(3-hata));
       System.out.println(" SURE          : "+ ((sn2-sn1)/1000) +" saniye");

   }else if(sayi2+sayi3 == cevap && (sn2>(sn1+5000))){
       System.out.println(" ===== DOGRU CEVAP AMA ZAMAN ASIMI :((( =====");
       System.out.println(" PUANINIZ : "+puan);
       hata++;
       System.out.println(" KALAN CANINIZ : "+(3-hata));
       System.out.println("ZAMAN ASIMI : "+ ((sn2-sn1)/1000)+" saniye");

   } else if (sayi2+sayi3 != cevap) {
       System.out.println(" ===== YANLIS CEVAP ====");
       System.out.println(" DOGRU CEVAP = " +(sayi2+sayi3) );
       System.out.println(" SURE = "+ ((Double.parseDouble(String.valueOf(sn2-sn1))/1000)) +" saniye");
       hata++;
       System.out.println(" KALAN CANINIZ : "+(3-hata));
   }


}while (hata<3);

        String sonuc = " ======================================== " +'\n'+
                       " ============== GAME OVER ===============" +'\n'+
                "KULLANICI ADI : "+ userName+'\n'+
                "PUANINIZ      : "+ puan;
        return sonuc;
    }
}


// OYUNUN BUG LARI 1- YARISMACI 1 DAKIKADAN FAZLA BEKLERSE SONUC DOGRU CIKMAYABILIR.
//   => ORNEGIN BASLANGIC SANIYESI 40.000 ITIS SANIYESI ISE SONRAKI DAKIKANIN 30.000UNCU SANIYESI => BU DURUMDA KULLANICI DOGRU CEVAP VERIRSE KABUL EDILIR
// YARISMADAKI SUREYI HESAPLAMAK ICIN TIMER KULLANMALIYIZ