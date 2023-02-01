package hastaneOtomasyon2;

import java.util.Scanner;

public class Login {
    public static boolean login() {
        Scanner input = new Scanner(System.in);
boolean sonuc= false;
        int count=3;
        do {

            System.out.println("Lutfen kimlik numaranizi giriniz");
            String kimlikNO = input.next().trim();
            System.out.println("Lutfen sifrenizi giriniz");
            String sifre = input.next().trim();

            try {
                if (VeriBankasi.doktorlar.get(kimlikNO).getSifre().equals(sifre)) {
                    System.out.println("dogru sifre");
                    sonuc = true;
                    count=0;
                } else {
                    System.out.println("Hatali giris yaptiniz, tekrar dneyiniz");
                    count--;
                    System.out.println("Kalan hakkinz : " + count);

                }
            }catch (Exception e){
                System.out.println(e+"Hatali giris yaptiniz, tekrar dneyiniz");
                count--;
                System.out.println("Kalan hakkinz : " + count);
            }
        }while (count>0);
return sonuc;
    }
}
