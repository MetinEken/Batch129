package arrrayAndList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ListDeneme {
    public static void main(String[] args) {

        List<String> deneme = new ArrayList<>();
        List<Integer> deneme2 = new ArrayList<>();
        List<Boolean> deneme3 = new ArrayList<>();
        List<Date> denem4 = new ArrayList<>();

       String x1[]={"     *","    * *","   *   *","  *     *"," *       *","* * * * * *"};

       int y1[][]={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};



        for (String w: x1 ) {
            System.out.println(w);
        }
        for (int[] w: y1 ) {
            for (int z: w ) {
                System.out.print(z);
            }
            System.out.println();
        }

        List<String> str = new ArrayList<>();







        str.add("metin");
        str.add("veli");
        str.add("mtin");
        System.out.println(str);

        Ogrenci ogr1 = new Ogrenci();

        Date date = new Date(); // bugunun tarihi

        ogr1.setName("metin");
        ogr1.setLastName("eken");
        ogr1.setAge(34);
        ogr1.setDate(date);
        ogr1.setParentsLive(true);


        Ogrenci ogr2 = new Ogrenci();

        Date date2 = new Date();

        ogr2.setName("metin");
        ogr2.setLastName("eken");
        ogr2.setAge(34);
        ogr2.setDate(date);
        ogr2.setParentsLive(true);


        List<Ogrenci> ogrenciler = new ArrayList<>();

        ogrenciler.add(ogr1);
        ogrenciler.add(ogr2);

        System.out.println(ogrenciler);
        System.out.println("======================");
        for (Ogrenci w: ogrenciler ) {
            System.out.println(w);
        }

        List<String> basit = new ArrayList<>();

        String x = "metin";
        String y = "eken";


        basit.add(x);
        basit.add(y);
        System.out.println("================= =========");
        System.out.println( ogrenciler.get(1));
        ogrenciler.set(0, ogr1);
        ogrenciler.forEach(System.out::println);


        Ogrenci[] ogrArray={ogr1,ogr2};


        System.out.println("======== ogrArray ==============");
        System.out.println(Arrays.toString(ogrArray));

        Object[] jhg={2, "dvfs",};



        List<Object> str2= new ArrayList<>();

        str2.add(2);  // int
        str2.add("metin"); // String
        str2.add(true); // boolean

        str2.add(date2);   // DAte
        System.out.println("========= SON CALISMA =========");
        System.out.println(str2.toString());




        System.out.println("====== TOPLUCA OBJE EKLEME ========");

        List<Object> ogrenci = new ArrayList<>();

        Object[] dersler=new Object[]{"dasfdf","vsdf",323};  //

        ogrenci.add(Arrays.toString(dersler));
        ogrenci.add("Metin");
        ogrenci.add(34);

        System.out.println(ogrenci.toString());

    }
}
