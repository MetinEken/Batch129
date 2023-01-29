//package mentor.market2;
//
//import mentor.market1.AnaMenu;
//
//import java.sql.SQLOutput;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//
//
//public class Market2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        List<String> manavUrunler = new ArrayList<>(); // "00 Domates 2.10"
//
//        List<String> kasapUrunler = new ArrayList<>();
//        List<String> icecekUrunler = new ArrayList<>();
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
//        for (String w : manavUrunler ) {
//            System.out.println(w);
//        }
//
//        for (String w : kasapUrunler ) {
//            System.out.println(w);
//        }
//        for (String w : icecekUrunler ) {
//            System.out.println(w);
//        }
//
//        String[] parca= manavUrunler.get(4).split(" ");
//        double fiyat = Double.parseDouble(parca[2]);
//        System.out.println("Fiyat  "+fiyat);
//        for (String w: parca) {
//            System.out.println(w);
//        }
//        System.out.println(parca);
//        System.out.println("   Marketimize Hosgeldiniz    ");
//
//        anaMenu(manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//
//    }
//
//    private static void anaMenu(List<String> manavUrunler, List<String> kasapUrunler, List<String> icecekUrunler, List<String> sepetim, Scanner input) {
//        boolean durum = true;
//        do {
//            System.out.println("yapacaginiz islemi seciniz");
//            System.out.println("==========================");
//            System.out.println("Manav alisveris icin A "+'\n'
//                    +"Kasap alisverisi icin K "+'\n'
//                    +"Icecek alisverisi icin I "+'\n'
//                    +"sepeti goruntulemek icin S "+'\n'
//                    +"Odeme yapmak icin O "+'\n'
//                    +"Cikis yapak icin Q ya BAsiniz");
//            String secim  = input.next().toUpperCase().trim();
//int bolum;
//            switch (secim){
//                case"A":
//                    bolum=0;
//                    alisVeris(bolum, manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//                    break;
//                case"K":
//                    bolum=1;
//                    alisVeris(bolum, manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//                    break;
//                case"I":
//                    bolum=2;
//                    alisVeris(bolum, manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//                    break;
//                case "S":
//                    sepet(manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//                    break;
//                case "O":
//                    break;
//                case "Q":
//                    durum=false;
//                    break;
//            }
//
//        }while (durum);
//
//
//    }
//
//    private static void sepet(List<String> manavUrunler, List<String> kasapUrunler, List<String> icecekUrunler, List<String> sepetim, Scanner input) {
//        System.out.println("===    SEPETINIZDEKI URUNLER ===");
//        int counter=1;
//        double total=0;
//    for (String w: sepetim ) {
//            System.out.println("S.no : "+counter+" "+w);
//            counter++;
//        }
//    }
//
//    static void alisVeris(int bolum, List<String> manavUrunler, List<String> kasapUrunler, List<String> icecekUrunler, List<String> sepetim, Scanner input) {
//List<String > bolumList= new ArrayList<>();
//
//        if (bolum==0){
//            bolumList=manavUrunler;
//        }else if(bolum==1){
//            bolumList=kasapUrunler;
//        } else if (bolum==2) {
//            bolumList=icecekUrunler;
//        }
//        System.out.println(" ========= URUNLER =========");
//        for (String w: bolumList) {
//            System.out.println(w);
//        }
//
//        System.out.println("almak istediginiz urunu seciniz");
//        int secim = input.nextInt();
//        System.out.println("Kac kilo almak istiyorsunuz");
//        double kilo = input.nextDouble();
//
//        String[] parca= bolumList.get(secim).split(" ");
//
//        double fiyat = Double.parseDouble(parca[2]);
//
//        double toplamFiyat=fiyat*kilo;
//
//
//        String sonislem =bolumList.get(secim)+" Kilo : "+kilo+" Toplam : "+toplamFiyat+"Tl";
//        sepetim.add(sonislem);
//        System.out.println("EKLENEN URUN  ...");
//        System.out.println(sonislem);
//
//        anaMenu(manavUrunler, kasapUrunler, icecekUrunler, sepetim, input);
//
//    }
//
//
//}
