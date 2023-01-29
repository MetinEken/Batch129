package mentor.Sorlar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DenemeClas {

    public static void main(String[] args) {

        System.out.println("uygulama aciliyor .......");
List<String> ogrenciler = new ArrayList<>();


        anaMenu();
       denemeMetodu();
    denemeMetodu2();



    }

    private static void denemeMetodu() {

    }

    public static String denemeMetodu2(){


        return "";
    }

    public static void anaMenu() {
        System.out.println("ogrenci eklemek icicn E ye bas");
        System.out.println("ogrenci listelemek icin L ye bas");
        System.out.println("devamsizliklari gormek icin D ye bas");
        System.out.println("cikis yapmak istiyorsaniz Q ya basin");
boolean cikis =true;

        do {
            Scanner input = new Scanner(System.in);
            String cevap = input.next().toUpperCase().substring(0);
            switch (cevap){
                case "E":
                    ogrenciEkle();
                    break;
                case"L":
             List<String> ogrenciler =      ogrencileriListele();
                    System.out.println("istediginiz ogrenciler gosteriliyor : "+ogrenciler.toString());
                    break;
                case"D":
                 int devamsizlik =    devamsizlikGor(4);
                    System.out.println("Alinin devamsizlik durumu : "+devamsizlik);

                    break;
                case"Q":
                    cikis = false;
                    System.out.println("basarili bir sekilde cikis yaptiniz");
                    break;
                default:
                    System.out.println("Yanlis giris yaptiniz, gecerli secim yapiniz");
            }

        }while (cikis);




    }

    private static List<String> ogrencileriListele() {

        List<String> isimler = new ArrayList<>();

        isimler.add("Ali");
        isimler.add("veli");
        isimler.add("fatma");

        return isimler;
    }


    private static int devamsizlikGor(int i) {
        int devamDurumu =0;

        if (i == 3){
            devamDurumu =3;
        } else if (i == 4) {
            devamDurumu=11;
        }
        return devamDurumu;
    }


    private static void ogrenciEkle() {
        System.out.println("ogrenci eklemeye hosgeldiniz");
        System.out.println("ogrenci ekleme basarili");
        anaMenu();

    }
// method olusturuldu ama hicbir yerden cagrilmadi, kullanilmadi
    public  void ogretmenEkle(){

    }


}
