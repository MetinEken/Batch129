package mentor.market1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnaMenu {
    public static void main(String[] args) {
        List <String> manavUrunIsmi=new ArrayList();
        List <Integer> manavId=new ArrayList();
        List <Double> manavFiyat=new ArrayList();


        manavUrunIsmi.add("Domates");
        manavUrunIsmi.add("Biber");
        manavUrunIsmi.add("Sogan");
        manavUrunIsmi.add("Patates");
        manavId.add(0);
        manavId.add(1);
        manavId.add(2);
        manavId.add(3);
        manavFiyat.add(2.10 );
        manavFiyat.add(1.50 );
        manavFiyat.add(2.3 );
        manavFiyat.add(3.20 );

        List <String> SepetUrunIsmi=new ArrayList();
        List <Integer> SepetUrunId=new ArrayList();
        List <Double> SepetUrunFiyat=new ArrayList();
        List <Integer> SepetUrunKilo=new ArrayList();
        List <Double> toplamFiyat=new ArrayList();



        anamenu(manavId,manavUrunIsmi,manavFiyat,SepetUrunIsmi,SepetUrunId,SepetUrunFiyat,SepetUrunKilo,toplamFiyat);

    }

    private static void anamenu(List<Integer> manavId, List<String> manavUrunIsmi, List<Double> manavFiyat,
                                List<String> sepetUrunIsmi, List<Integer> sepetUrunId, List<Double> sepetUrunFiyat,
                                List<Integer> sepetUrunKilo, List<Double> toplamFiyat) {
        Scanner input = new Scanner(System.in);
        System.out.println("hosgeldınız");

        System.out.println("ne yapmak istiyorsunuz");
        System.out.println("alisveris yapmak    A");
        System.out.println("sepeti gormek       S ");
        System.out.println("oseme yapmak        O");
        System.out.println("anaMenu icin       M");
        System.out.println("cikis icin         Q");

        String secim1 =input.next().toUpperCase().trim();

        switch (secim1){
            case"A":
                Alisveris(manavId,manavUrunIsmi,manavFiyat,sepetUrunIsmi,sepetUrunId,sepetUrunFiyat,sepetUrunKilo,toplamFiyat, input);
                break;
            case"S":
                sepetgoruntule(manavId,manavUrunIsmi,manavFiyat,sepetUrunIsmi,sepetUrunId,sepetUrunFiyat,sepetUrunKilo,toplamFiyat, input);
                break;
            case"O":
                odeme(manavId,manavUrunIsmi,manavFiyat,sepetUrunIsmi,sepetUrunId,sepetUrunFiyat,sepetUrunKilo,toplamFiyat, input);
                break;
            case"M":
                break;
            case"Q":
                break;
            default:
        }

    }

    private static void odeme(List<Integer> manavId, List<String> manavUrunIsmi, List<Double> manavFiyat, List<String> sepetUrunIsmi, List<Integer> sepetUrunId, List<Double> sepetUrunFiyat, List<Integer> sepetUrunKilo, List<Double> toplamFiyat, Scanner input) {

        double toplam=0.00;
        for (double w: toplamFiyat ) {
            toplam=toplam+w;
        }

        System.out.println("toplam tutar : "+toplam+"TL");

double paragir= input.nextDouble();
        System.out.println();


    }

    private static void sepetgoruntule(List<Integer> manavId, List<String> manavUrunIsmi, List<Double> manavFiyat, List<String> sepetUrunIsmi, List<Integer> sepetUrunId, List<Double> sepetUrunFiyat, List<Integer> sepetUrunKilo, List<Double> toplamFiyat, Scanner input) {
        System.out.println("sepetteki tum urunler ");

        for(int i=0;i<sepetUrunIsmi.size();i++){
            System.out.println(""+sepetUrunIsmi.get(i)+" "+sepetUrunFiyat.get(i)+"alacagınız miktar "+sepetUrunKilo.get(i)+" kg "+" toplam fiyat "+toplamFiyat.get(i));

        }
        anamenu(manavId,manavUrunIsmi,manavFiyat,sepetUrunIsmi,sepetUrunId,sepetUrunFiyat,sepetUrunKilo,toplamFiyat);

    }

    private static void Alisveris(List<Integer> manavId, List<String> manavUrunIsmi, List<Double> manavFiyat, List<String> sepetUrunIsmi, List<Integer> sepetUrunId, List<Double> sepetUrunFiyat, List<Integer> sepetUrunKilo, List<Double> toplamFiyat, Scanner input) {


        for(int i=0;i<manavId.size();i++){
            System.out.println(manavId.get(i)+" "+manavUrunIsmi.get(i)+" "+manavFiyat.get(i)+"TL");

        }

        System.out.println("istediginz urunun ID sini girin");
        int secim=input.nextInt();

        System.out.println("kac kilo lazım");
        int kilo=input.nextInt();


        sepetUrunKilo.add(kilo);

        sepetUrunIsmi.add(manavUrunIsmi.get(secim));

        sepetUrunId.add(manavId.get(secim));

        sepetUrunFiyat.add(manavFiyat.get(secim));

        toplamFiyat.add(kilo*manavFiyat.get(secim));

        sepetUrunKilo.add(kilo);
        System.out.println("Eklediginiz urun asagidadir");

       // System.out.println(""+sepetUrunIsmi+sepetUrunFiyat+"alacagınız miktar "+kilo+" kg "+" toplam fiyat "+toplamFiyat);

        for(int i=0;i<sepetUrunIsmi.size();i++){
            System.out.println(""+sepetUrunIsmi.get(i)+" "+sepetUrunFiyat.get(i)+"alacagınız miktar "+sepetUrunKilo.get(i)+" kg "+" toplam fiyat "+toplamFiyat.get(i));

        }

        anamenu(manavId,manavUrunIsmi,manavFiyat,sepetUrunIsmi,sepetUrunId,sepetUrunFiyat,sepetUrunKilo,toplamFiyat);

    }
}
