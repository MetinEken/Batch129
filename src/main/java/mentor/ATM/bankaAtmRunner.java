package mentor.ATM;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class bankaAtmRunner {
    public static void main(String[] args) {
        System.out.println("===== BIZIM BANKAMIZA HOSGELDINIZ =====");
        System.out.println("      Lutfen ismini giriniz");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine().toUpperCase().trim();
        Double account =100.00;
        List<String> islemlerim = new ArrayList<>();

        anaMenu(name, account, input, islemlerim);
        System.out.println("BIZI TERCIH ETTIGINIZ ICIN TESEKKURLER...");
        System.out.println("============ BIZIM BANKAMIZ ============");
    }

    private static void anaMenu(String name, Double account, Scanner input, List<String> islemlerim) {
        boolean secenek=true;
        do {
            System.out.println("MERHABA SAYIN : " +name);

            System.out.println("LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECINIZ");
            System.out.println("BAKIYE SORGULAMAK ICIN      :   B");
            System.out.println("PARA CEKMEK ICIN            :   P");
            System.out.println("PARA YATIRMAK ICIN          :   Y");
            System.out.println("ONCEKI ISLEMLER ICIN        :   G");
            System.out.println("CIKIS YAPMAK ICIN           :   Q");

            String secim = input.next().toUpperCase().trim().substring(0,1);

            switch (secim){
                case"B":
                    bakiyeGoster( name,account, input, islemlerim);
                    break;
                case "P":
                    paraCekme( name,account, input, islemlerim);
                    break;
                case"Y":
                    yatirma( name,account, input, islemlerim);
                    break;
                case"G":
                    oncekiIslemler(name,account, input, islemlerim);
                    break;
                case"Q":
                    secenek=false;
                    break;
            }

        }while (secenek);

    }

    private static void yatirma(String name, Double account, Scanner input, List<String> islemlerim) {
        System.out.println("yatirmak istediginiz miktari giriniz");
        double miktar = input.nextDouble();
        if (miktar>0){
            account = account+miktar;
            System.out.println("yatirma basarili");
            Date date = new Date();
            String yatirma ="YATIRMA : " +miktar+"   Tarih : "+date;
            islemlerim.add(yatirma);
            anaMenu(name,account, input, islemlerim);
        }else {
            System.out.println("lutfen gecerli bir miktar giriniz");
            yatirma( name,account, input, islemlerim);
        }
    }

    private static void oncekiIslemler(String name, Double account, Scanner input, List<String> islemlerim) {
        int sayac=1;
        System.out.println("gecmis islemleriniz");
        System.out.println("===========================");
        System.out.println(islemlerim.size());

        for (int i=islemlerim.size()-1; i>=0; i--){
            System.out.print("islem No : "+sayac+" : ");
            System.out.println(islemlerim.get(i).toString());
            sayac++;
        }
    }

    private static void paraCekme(String name, Double account,  Scanner input, List<String> islemlerim) {
        System.out.println("para cekmeye hosgeldiniz");
        System.out.println("cekmek istediginiz tutai giriniz");
        double cekilecek = input.nextDouble();
        if (account>=cekilecek){
            account= account-cekilecek;
            System.out.println("para cekme basarili");
            Date date = new Date();
            String islem="CEKME   : "+cekilecek +"   Tarih : "+date;
            System.out.println(islem);
            islemlerim.add(islem);
            anaMenu( name,account, input,islemlerim);
        }else{
            System.out.println("Yetersiz bakiye. tekrar deneyiniz");
            paraCekme(name, account, input,islemlerim);
        }

    }

    private static void bakiyeGoster(String name, Double account,  Scanner input, List<String> islemlerim) {

        System.out.println("HESABINIZ DA : " + account+"TL bulunmaktadir. ");
        System.out.println("ana menu icin     : A");
        System.out.println("para cekmek icin  : P");

        String secim = input.next().toUpperCase().trim().substring(0);

        boolean secenek=true;
        do {
            switch (secim){
                case"A":
                    anaMenu( name, account, input, islemlerim);
                    break;
                case "P":
                    paraCekme(name, account,  input, islemlerim);
                    break;



        }
    }while (secenek);


}}
