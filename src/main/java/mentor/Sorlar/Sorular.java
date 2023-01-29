package mentor.Sorlar;

import java.util.Scanner;

public class Sorular {
    public static void main(String[] args) {
        System.out.println("lutfen gunismini giriniz");

boolean kontrol= true;

do {
    Scanner input = new Scanner(System.in);
    String cevap = input.next().toUpperCase(); // BURDA BEKLIYOR

    if (cevap.equals( "PAZARTESI")){
        System.out.println("Paz");

    }else if(cevap.equals( "SALI")){
        System.out.println("Sal");

    }else if(cevap.equals( "CARSAMBA")){
        System.out.println("Car");

    }else if(cevap.equals( "PERSEMBE")){
        System.out.println("Per");

    }else if(cevap.equals( "CUMA")){
        System.out.println("Cum");

    }else if(cevap.equals( "CUMARTESI")){
        System.out.println("Cum");

    }else if(cevap.equals( "PAZAR")){
        System.out.println("Paz");

    }else {
        System.out.println("HATALI GIRIS YAPTINIZ");
        kontrol = false;
    }
}while (! kontrol);


}}
