package mentor.okulProgrami;

import java.util.*;

public class Runner {
    public static void main(String[] args) {




        List<Ogrenci>  ogrenciler = new ArrayList<>();

        Date date = new Date();

        Ogrenci ogr = new Ogrenci();

        ogr.setName("Metin");
        ogr.setLastName("eken");
        ogr.setAge(33);
        ogr.setParentsLive(true);
        ogr.setDateBorn(date);

        ogrenciler.add(ogr);

        List<String> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        y.add(1);
        y.add(2); //
        y.add(3);
        y.add(3);
        y.add(3);
        System.out.println(y.toString());

        y.remove(1);
        y.remove(Integer.valueOf(3)); // index 1 olani silecek, ilk gordugu objeyi sildi
        y.removeAll(Collections.singleton(Integer.valueOf(3)));
        System.out.println(y.toString());
        System.out.println(ogrenciler.toString());

    Long saniye = System.currentTimeMillis();
        System.out.println(saniye);

    }


}
