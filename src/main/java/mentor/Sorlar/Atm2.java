package mentor.Sorlar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Atm2 {
    public static void main(String[] args) {
        System.out.println("hosgeldınız");

        List<String> islemlerim = new ArrayList<>();

        Double hesabım=5.0;
        Scanner input=new Scanner(System.in);
        System.out.println("isim gir");
        String isim=input.nextLine();

        Anamenu(isim,hesabım,input,islemlerim);
        System.out.println("");
    }
    private static void Anamenu(String isim, Double hesabım, Scanner input, List<String> islemlerim) {

        boolean cıkayımmı=true;

        do {
            System.out.println("para çekmek ıcın P ye bas"+'\n' +
                    "para yatırmak için Y ye bas"+'\n'+
                    "bakıye görmek ıcın B ye bas"+'\n' +
                    "havale için H ye basınız"+'\n'+
                    "gecmis islemleri gotmekicin G ye bas"+'\n'+
                    "cıkıs ıcın Q ya bas");
            Character secenek=input.next().toUpperCase().charAt(0);
            switch (secenek) {

                case 'P': paracek(isim,hesabım,input, islemlerim);break;
                case 'B':bakiyegörme(isim,hesabım,input, islemlerim);break;
                case 'Y':parayatırma(isim,hesabım,input, islemlerim);break;
                case 'H':havale(isim,hesabım,input, islemlerim);break;
                case 'G':gecmisIslemler(isim,hesabım,input, islemlerim);break;
                case 'Q':cıkayımmı=false;
            }}while (cıkayımmı);    }

    private static void gecmisIslemler(String isim, Double hesabım, Scanner input, List<String> islemlerim) {
        System.out.println("gecmis islemleriniz    ");
        int siraNo=1;
        for (String w: islemlerim) {
            System.out.println(siraNo+" : "+w);
            siraNo++;
        }
//        System.out.println(islemlerim.toString());
    }

    private static void bakiyegörme(String isim, Double hesabım, Scanner input , List<String> islemlerim) {
        System.out.println("hesabınızda bulunan mıktar"+hesabım);
        do{
            System.out.println("paracekmek ıcın P ye bas"+'\n' +"anamenu ıcın A ya bas");
            Character secenek=input.next().toUpperCase().charAt(0);
            if(secenek=='P'){paracek(isim,hesabım,input, islemlerim);}
            else
            if (secenek=='A') {Anamenu(isim,hesabım,input, islemlerim);
            }else {
                System.out.println("yanlıs giriş tekrar deneyın");

            }}while (true);
    }

    private static void paracek(String isim, Double hesabım, Scanner input , List<String> islemlerim) {
        System.out.println("ne kadar cekıceksın");
        Double cekılcekmıktar=input.nextDouble();
        if(hesabım>=cekılcekmıktar){

            hesabım=hesabım-cekılcekmıktar;

            System.out.println("cekme ıslemı basarılı kalan mıktar  "+hesabım);
            String cekme= "CEKME";
            Date date = new Date();
            String islem =cekme +" Tarih : "+ date+" Miktar : "+cekılcekmıktar;
            islemlerim.add(islem);

            Anamenu(isim,hesabım,input, islemlerim);}
        else {
            System.out.println("bakiye yetersiz. tekrar dene");
            paracek(isim,hesabım,input, islemlerim);
        }
    }

    private static void parayatırma(String isim, Double hesabım, Scanner input, List<String> islemlerim) {
        System.out.println("ne kadar para yatırmak istiyosunuz");

        double ytc = input.nextDouble();

        hesabım+=ytc;
        String yatirma ="YATIRMA";
        Date date = new Date();
        String islem =yatirma+" Miktar : "+ytc+" Tarih : "+date;
        islemlerim.add(islem);
        System.out.println(hesabım);

        Anamenu(isim,hesabım,input, islemlerim);

    }

    private static void havale(String isim, Double hesabım, Scanner input , List<String> islemlerim){
        System.out.println("ne kadar para göndermek istiyosunuz"+'\n'+"iptal etmek için 00 a basınız" );
        double gndr = input.nextDouble();


        if (gndr==00){
            Anamenu(isim,hesabım,input, islemlerim);
        }
        else if (hesabım>=gndr){
            System.out.println("göndermek istediğiniz kişiyi seçiniz"+'\n'+"AHMET İÇİN 1"+'\n'+"MEHMET İÇİN 2"+'\n'+"SELİM İÇİN 3");
            int secenek =input.nextInt();

            String kime="";
            switch (secenek){
                case 1: hesabım =hesabım-gndr;
                    System.out.println("havale işlemi gerçekleşti yeni bakiyeniz "+hesabım);
                    kime="AHMET";
                    break;
                case 2: hesabım =hesabım-gndr;
                    System.out.println("havale işlemi gerçekleşti yeni bakiyeniz "+hesabım);
                    kime="MEHMET";
                    break;
                case 3: hesabım =hesabım-gndr;
                    System.out.println("havale işlemi gerçekleşti yeni bakiyeniz "+hesabım);
                    kime="SELIM";
                    break;

            }
            Date date = new Date();
            String islem ="HAVALE"+" KIME ; "+kime+" Miktar : "+gndr+" Tarih : "+date;
            islemlerim.add(islem);

        }else {
            System.out.println("bakiye yetersiz");
            havale(isim,hesabım,input, islemlerim);
        }
    }
}

