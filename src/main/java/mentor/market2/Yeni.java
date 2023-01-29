//package mentor.market2;
//
//import java.util.*;
//
//
//
//
//public class Yeni {
//    public static void main(String[] args) {
//
//        // odev 94 96 satirlarda
//
//        Scanner input = new Scanner(System.in);
//
//        List<String> manavUrunler = new ArrayList<>(); // "00 Domates 2.10 kilo : 2 toplam : 4.20"
//
//        List<String> kasapUrunler = new ArrayList<>();
//        List<String> icecekUrunler = new ArrayList<>();
//
//        List<String> sepetim = new ArrayList<>();
//
//        manavUrunler.add("00 Domates 2.10"); // +kilo : 2 toplamTitar : 4.2
//        manavUrunler.add("01 Biber 3.50");
//        manavUrunler.add("02 Patates 1.50");
//        manavUrunler.add("03 Sogan 2.00");
//        manavUrunler.add("04 patlican 3.75");
//
//        kasapUrunler.add("00 Kirmizi-et 75.00");
//        kasapUrunler.add("01 Tavuk-et 35.00");
//        kasapUrunler.add("02 Kiyma 65.00");
//
//        icecekUrunler.add("00 Fanta 5.50");
//        icecekUrunler.add("01 CKola 7.50");
//        icecekUrunler.add("02 Pepsi 6.50");
//        icecekUrunler.add("03 Salgam 5.75");
//
//        System.out.println("Marketimize hosgeldiniz ");
//
//        anaMenu(manavUrunler,kasapUrunler,icecekUrunler,sepetim,input);
//
//
//    }
//
//    private static void anaMenu(List<String> manavUrunler, List<String> kasapUrunler, List<String> icecekUrunler, List<String> sepetim, Scanner input) {
//
//        System.out.println("yapacaginiz islemi seciniz");
//        System.out.println("==========================");
//        System.out.println("Manav alisveris icin A "+'\n'
//                +"Kasap alisverisi icin K "+'\n'
//                +"Icecek alisverisi icin I "+'\n'
//                +"sepeti goruntulemek icin S "+'\n'
//                +"Odeme yapmak icin O "+'\n'
//                +"ADMIN SAYFASI ICIN D "+'\n'
//                +"Cikis yapak icin Q ya BAsiniz");
//
//        String secim = input.next().toUpperCase().trim();
//
//        int bolum;
//        boolean durum=true;
//
//        switch (secim){
//            case"A":
//                bolum=0;
//                alisVeris(bolum, manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//                break;
//            case"K":
//                bolum=1;
//                alisVeris(bolum, manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//                break;
//            case"I":
//                bolum=2;
//                alisVeris(bolum, manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//                break;
//            case "S":
//                sepet(manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//                break;
//            case "O":
//                odeme(manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//                break;
//            case"D":
//                adminMenu(manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//            case "Q":
//                durum=false;
//                break;
//        }
//
//
//    }
//
//
//
//
//    private static void adminMenu(List<String> manavUrunler, List<String> kasapUrunler, List<String> icecekUrunler, List<String> sepetim, Scanner input) {
//        System.out.println("ne slem yapmak istirosunuz");
//        System.out.println("Urun eklemek icin E "+'\n'
//                +"Fiyat degisikligi icin D "+'\n'
//                +"Satislari gormek S "+'\n'             );
//        String secenek = String.valueOf(input.next().toUpperCase().trim().charAt(0));
//
//
//        switch (secenek){
//            case"E":
//                ekle( manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//                break;
//            case"D":
//
//                degistir( manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//                break;
//            case"S":
//                satislar( manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//                break;
//
//        }
//    }
//
//    private static void satislar(List<String> manavUrunler, List<String> kasapUrunler, List<String> icecekUrunler, List<String> sepetim, Scanner input) {
//    }
//
//    private static void degistir(List<String> manavUrunler, List<String> kasapUrunler, List<String> icecekUrunler, List<String> sepetim, Scanner input) {
//    }
//
//    private static void ekle(List<String> manavUrunler, List<String> kasapUrunler, List<String> icecekUrunler, List<String> sepetim, Scanner input) {
//        System.out.println("hangi liosteyi degistirmek istiyorsun");
//        System.out.println(" manav 1 ,, kasap 2,,, Icecek 3");
//        int bolum2 = input.nextInt();
//        //  List<String> secilenListe = new ArrayList<>();
//
//        if (bolum2==1){
//            System.out.println("ururn bilgisini giriniz");
//            String yeniUrun= input.nextLine().trim();
//            manavUrunler.add(yeniUrun);
//            System.out.println("eklenen urun");
//
//        } else if (bolum2==2) {
//
//            System.out.println("ururn bilgisini giriniz");
//            String yeniUrun= input.nextLine().trim();
//            kasapUrunler.add(yeniUrun);
//            System.out.println("eklenen urun");
//        } else if (bolum2==3) {
//            System.out.println("ururn bilgisini giriniz");
//            String yeniUrun= input.nextLine().trim();
//            icecekUrunler.add(yeniUrun);
//            System.out.println("eklenen urun");
//        }else {
//            System.out.println("yanlis giris yaptiniz");
//            ekle( manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//        }
//
//        private static void odeme(List<String> manavUrunler, List<String> kasapUrunler, List<String> icecekUrunler, List<String> sepetim, Scanner input) {
//            System.out.println("odeme Methodu");
//            double toplam =0;
//
//            for (String w: sepetim) {
//                String[] gecici =  w.split(" ");
//
//                toplam= toplam+ Double.parseDouble( gecici[gecici.length-1]);
//            }
//
//            System.out.println("toplam " +
//                    "borcunu : "+toplam);
//            double nakit = input.nextDouble();
//
//            // girilen nakit parayi karsilastirin
//            // az ise tekrar isteyin
//            // cok ise para ustu verin
//
//
//            anaMenu(manavUrunler,kasapUrunler,icecekUrunler,sepetim,input);
//        }
//
//        private static void sepet(List<String> manavUrunler, List<String> kasapUrunler, List<String> icecekUrunler, List<String> sepetim, Scanner input) {
//            System.out.println("sepetinizdeki tum urunler");
//            System.out.println("==========================");
//
//            for (String w: sepetim) {
//                System.out.println(w);
//            }
//
//            System.out.println("Nereye gitmek istiyorsun");
//            System.out.println("ana menu icin A ");
//            System.out.println("odeme icin O ");
//
//            String git =input.next().toUpperCase().trim();
//            switch (git){
//                case"A":
//                    anaMenu(manavUrunler,kasapUrunler,icecekUrunler,sepetim,input);
//                    break;
//                case "O":
//                    odeme(manavUrunler,kasapUrunler,icecekUrunler,sepetim,input);
//                default:
//            }
//
//
//
//        }
//
//        private static void alisVeris(int bolum, List<String> manavUrunler, List<String> kasapUrunler, List<String> icecekUrunler, List<String> sepetim, Scanner input) {
//
//            List<String> yazdirilanListe = new ArrayList<>();
//
//            if (bolum==0){
//                yazdirilanListe=manavUrunler;
//            } else if (bolum==1) {
//                yazdirilanListe=kasapUrunler;
//            } else {
//                yazdirilanListe=icecekUrunler;
//            }
//            System.out.println("urunler");
//
//
//
//            for (String w: yazdirilanListe ) {
//
//                System.out.println(w);
//            }
//
//
//            System.out.println("almak istediginiz urun numarasini giriniz");
//            int secim = input.nextInt();
//            System.out.println("kac kilo almak istiyorsunuz");
//            double kilo = input.nextDouble();
//
//            String[] parca =yazdirilanListe.get(secim).split(" ");
//
//            double fiyat = Double.parseDouble(parca[2]);  // 2.10
//
//            double toplam = fiyat*kilo;
//
//            String ekle=yazdirilanListe.get(secim)+" Kilo : "+kilo+" Tutar : "+toplam;
//
//
//            sepetim.add(ekle);
//            System.out.println("Eklenen urun "+ekle);
//
//            anaMenu(manavUrunler,kasapUrunler,icecekUrunler,sepetim,input);
//        }
//    }
