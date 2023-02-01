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
            System.out.println("    RANDEVULARI GORMEK ICIN R YE BASINIZ");
            System.out.println("    CIKIS ICIN 'Q' YA BASINIZ");
            String secim = input.next().trim().toUpperCase().substring(0,1);

            switch (secim){
                case"D":
                    VeriBankasi.doktorlistele();
                    break;
                case"E":
                   createDoktor();
                    break;
                case"U":
                    updateDoktor();
                    break;
                case"R":
                    VeriBankasi.getRandevular();
                    break;
                case "Q":
                    devam=false;
                    break;
                default:
                    System.out.println("yanlos secim tekrar deneyin");
            }

        }while (devam);

    }

    private static void updateDoktor() {
        Scanner input = new Scanner(System.in);
        boolean durum=true;

        Doktor doktor = new Doktor();
        do {
         System.out.println("doktor kimlikNo giriniz");
         String kimlikNo = input.next().trim();

         try {
             doktor = VeriBankasi.doktorlar.get(kimlikNo);

             int yas = doktor.getYas(); //0

             if (yas >0) {
                 durum=false;
             }else{
                 System.out.println("Doktor bulunamadi veya yanlis kimlik numarasi");
                 //burada bulamamistir
             }
         }catch (Exception e){
             System.out.println(e);
             System.out.println("Doktor bulunamadi veya yanlis kimlik numarasi");
             // burda da bulamamistir
         }




     }while (durum);

            System.out.println(doktor);
            System.out.println("degistirmek istemediginiz bolumlerde '0 (SIFIR)' a basiniz");
            System.out.println("Soyisim giriniz");
            input.nextLine();
            String newSoyIsim = input.nextLine().trim();
            System.out.println("isim giriniz");
            String newIsim =input.nextLine().trim();

            System.out.println("bolum giriniz");
            String newBolum = input.nextLine().trim().toLowerCase();

            System.out.println("yas giriniz");
            //try cacth yazilacak
            int newYas = input.nextInt();

            System.out.println("KimlikNo giriniz");
            String newKimlikNo = input.next().trim();

            if (!newIsim.equals("0"))doktor.setIsim(newIsim);
            if (!newSoyIsim.equals("0"))doktor.setSoyAd(newSoyIsim);
            if (newYas != 0)doktor.setYas(newYas);
            if (!newBolum.equals("0"))doktor.setBolum(newBolum);


            if (!newKimlikNo.equals("0")){VeriBankasi.doktorlar.remove(doktor.getKimlikNo());}
            if (!newKimlikNo.equals("0"))doktor.setKimlikNo(newKimlikNo);

            VeriBankasi.doktorlar.put(doktor.getKimlikNo(), doktor);

        }




    private static void createDoktor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Doktor Tc kimlik no giriniz");
        String tc=input.next();
        System.out.println("Doktor İsim  giriniz");
        String name= input.next();
        System.out.println("Doktor Soy isim giriniz");
        String SurName=input.next();
        System.out.println("yaş gir");
        int yas= input.nextInt();
        System.out.println("bölüm giriniz");
        String bolum = input.nextLine().trim().toLowerCase();

        Doktor doktor = new Doktor(bolum, name, SurName, yas, tc,"aaaaaaa");
// ya doktor onceden kayitli ise
        VeriBankasi.doktorlar.put(doktor.getKimlikNo(), doktor);
    }
}
