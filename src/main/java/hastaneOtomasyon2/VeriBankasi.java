package hastaneOtomasyon2;

import java.util.*;

public class VeriBankasi {
    static HashMap<String,Doktor>doktorlar=new HashMap<>();

    static HashMap<String, Randevular>hastalar=new HashMap<>(); //randevu almis kisiler
   static Doktor doktor1=new Doktor("dahiliye","Ahmet","Can",34,"111111","aaaaaaa");
   static Doktor doktor2=new Doktor("cerrah","Selim","Can",22,"222222","aaaaaaa");
   static   Doktor doktor3=new Doktor("kbb","Akın","Can",30,"333333","aaaaaaa");
   static Doktor doktor4=new Doktor("göz","Metin","Can",42,"444444","aaaaaaa");
    public static void doktorEkle(){
        Doktor doktor1=new Doktor("dahiliye","Ahmet","Can",34,"111111","aaaaaaa");
        Doktor doktor2=new Doktor("cerrah","Selim","Can",22,"222222","aaaaaaa");
        Doktor doktor3=new Doktor("kbb","Akın","Can",30,"333333","aaaaaaa");
        Doktor doktor4=new Doktor("göz","Metin","Can",42,"444444","aaaaaaa");
        Doktor doktor5=new Doktor("psikiyatri","Can","yılmaz",52,"555555","aaaaaaa");
        Doktor doktor6=new Doktor("fizik","Mehmet","Can",82,"666666","aaaaaaa");
        Doktor doktor7=new Doktor("kadın doğum","Süleyman","Can",62,"777777","aaaaaaa");

        doktorlar.put(doktor1.getKimlikNo(), doktor1);
        doktorlar.put(doktor2.getKimlikNo(), doktor2);
        doktorlar.put(doktor3.getKimlikNo(), doktor3);
        doktorlar.put(doktor4.getKimlikNo(), doktor4);
        doktorlar.put(doktor5.getKimlikNo(), doktor5);
        doktorlar.put(doktor6.getKimlikNo(), doktor6);
        doktorlar.put(doktor7.getKimlikNo(), doktor7);
    }



    public static void hastaEkle(){

        Randevular randevular1 =new Randevular(false,"Alerji","Selman","Yılmaz",45,"11111",doktor2);
        Randevular randevular2 =new Randevular(true,"Hamile","Hatice","Yılmaz",35,"22222", doktor2);
        Randevular randevular3 =new Randevular(false,"Grip","Murat","Yılmaz",15,"33333", doktor1);
        Randevular randevular4 =new Randevular(true,"Kalp krizi","Ali","Yılmaz",55,"44444", doktor1);
        Randevular randevular5 =new Randevular(false,"Astım","Süleyman","Yılmaz",65,"55555", doktor1);

        hastalar.put(randevular1.getKimlikNo(), randevular1);
        hastalar.put(randevular2.getKimlikNo(), randevular2);
        hastalar.put(randevular3.getKimlikNo(), randevular3);
        hastalar.put(randevular4.getKimlikNo(), randevular4);
        hastalar.put(randevular5.getKimlikNo(), randevular5);
    }

    public static Doktor getdoktor(String bolum) {
         Doktor doktor = new Doktor();
        for (Map.Entry<String, Doktor> entry : doktorlar.entrySet()) {
            if (entry.getValue().getBolum().equals(bolum)){
                 doktor =entry.getValue();
            }
        }

        return doktor;
    }

    public static List<Doktor> getDoktors(String bolum){
        List<Doktor> doktorliST = new ArrayList<>();

        for (Map.Entry<String, Doktor> entry : doktorlar.entrySet()) {

            if (entry.getValue().getBolum().equals(bolum)) {
                doktorliST.add(entry.getValue());
            }
        }

        return doktorliST;
    }

    public static void randevuEkle(Randevular randevular1) {
        hastalar.put(randevular1.getKimlikNo(), randevular1);
    }

    public static void randevumuGoster() {
        Scanner input = new Scanner(System.in);
        System.out.println("kimlik no giriniz");
        String tc = input.next().trim();

        Randevular randevum=hastalar.get(tc);
        System.out.println("Randevunuz");
        //if randevusu yoksa randevunuz yoktur yazdir
        System.out.println(randevum);
    }

    public static void getRandevular() {

        for (Map.Entry<String, Randevular> entry : hastalar.entrySet()) {
            //ifbolum == dahi     yazdir
            System.out.println(entry.getValue());
        }


    }

    public static void doktorlistele() {

        for (Map.Entry<String, Doktor> entry : doktorlar.entrySet()) {

            System.out.println(entry.getValue());
        }
    }


}


