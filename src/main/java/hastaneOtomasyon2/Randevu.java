package hastaneOtomasyon2;

import java.util.Scanner;

public class Randevu {

    static   Scanner input=new Scanner(System.in);



    public static void randevuAlma(){
        System.out.println("Tc kimlik no giriniz");
        String tc=input.next();
        System.out.println("İsim  giriniz");
        String name= input.next();
        System.out.println("Soy isim giriniz");
        String SurName=input.next();
        System.out.println("yaş gir");
        int yas= input.nextInt();
        System.out.println("bölüm seç");
        System.out.println("Dahiliye için 1 "+'\n'+"Cerrah için 2"+'\n'+"Kbb için 3 "+'\n'+"Göz için 4"+'\n'+
                "psikiyatri için 5"+'\n'+"Fizik için 6"+'\n'+"Kadın doğum için 7 "+'\n'+"çıkmak için 8 seç");

        int seçim;
        String bolum = "0";
        boolean dogrumu=false;
        do {
            dogrumu=false;
            seçim=input.nextInt();
            switch (seçim){
                case 1:
                    bolum="dahiliye";
                    break;
                case 2:
                    bolum="cerrah";
                    break;
                case 3:
                    bolum="kbb";
                    break;
                case 4:
                    bolum="göz";
                    break;
                case 5:
                    bolum="psikiyatri";
                    break;
                case 6:
                    bolum="fizik";
                    break;
                case 7:
                    bolum="kadın doğum";
                    break;
                case 8:
                    //cikis
                    break;
                default:
                    System.out.println("tekrar deneyiniz");
                    dogrumu=true;
                    break;
            }

        }while (dogrumu);

        boolean aciliyet=false;
        if (yas>=65 || yas<=7){
            aciliyet=true;
        }

        Doktor doktor=VeriBankasi.getdoktor(bolum);

        Randevular randevular1 =new Randevular(aciliyet,"muayene",name,SurName,yas,tc, doktor);

    VeriBankasi.hastalar.put(randevular1.getKimlikNo(), randevular1);

//  VeriBankasi.randevuEkle(randevular1);  // gerek kalmadi

      //  List<Doktor> doktorlar =VeriBankasi.getDoktors(bolum);
      // birden fazla doktor secenegi icin
//        System.out.println(randevular1);
//        System.out.println(doktor);
    }


}