package yazBoz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Deneme1 {
    public static void main(String[] args) {
        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDAR");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");
        System.out.println("databaseIsim = " + databaseIsim);
        //databaseIsim = [AYSE, AHMET, SERDAR, OKAN, BETUL]

        Scanner input = new Scanner(System.in);

        // 1.Adim Kullanicidan kullanmak istedigi kullanici adini aliriz

        System.out.println("Lutfen kullanici adinizi giriniz");

        // 2.Adimda kullanicidan aldigim datayi database uygun ve taskin  istedigi gibi bosluksuz hale getirdim
        String username = input.nextLine().toUpperCase().trim();

        //3 .Adimda kullanici adinin kullanilabilir olup olmadigini database ile kiyasliyacagiz

        if(databaseIsim.contains(username)){
            System.out.println("Bu kullanici adi zaten alinmis ");
        }else{
            System.out.println("Bu kullanici adini kullanabilirsiniz");
        }

        if(databaseIsim.contains(username)){
            int rastgeleSayi= new Random().nextInt(100);

            username=username+""+rastgeleSayi;
            System.out.println("Yeni kullanici adi olarak bunu kullanabilirsiniz "+username);
        }else{
            System.out.println("Yeni kullanici adi : "+username);
        }

    }
}
