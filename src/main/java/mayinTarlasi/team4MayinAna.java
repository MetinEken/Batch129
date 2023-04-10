package mayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class team4MayinAna {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rnd=new Random();
        int kackare=2;
        //int kackare=input.nextInt();
        int[][] mayin=new int[kackare][kackare];
        int[][] oyunEkrani=new int[kackare][kackare];

        int sinir=kackare*kackare/4;
        while (sinir>0) {
            int a=rnd.nextInt(kackare);
            int b=rnd.nextInt(kackare);

            if (mayin[a][b]!=-1){
                mayin[a][b]=-1;
                sinir--;
            }


        }
        sinir=kackare*kackare/4;


        printArr(kackare, mayin);
        int gerekendgrucvpsayi=kackare*kackare-sinir;

        while (gerekendgrucvpsayi>0) {

            System.out.println(" oyuna hg");
            printArr(kackare,oyunEkrani);
            System.out.println(gerekendgrucvpsayi +" gereken dogru cevap sayisi");
            System.out.println("bomba olmadıgını dusundugun satırı gir");
            int satir=input.nextInt();
            System.out.println("sutunu gir");
            int sutun=input.nextInt();
            if (satir>=kackare || sutun>=kackare) {System.out.println("gecerli sati veya sutun giriniz");continue;}
        int sonuc=    mayinKontrolu(satir, sutun, mayin, kackare);
    int mayinlar=0;
        if(sonuc==1){

            break;
        }else{
            mayinlar+=    mayinKontrolu(satir, sutun+1, mayin, kackare);
            mayinlar+=    mayinKontrolu(satir, sutun-1, mayin, kackare);
            mayinlar+=    mayinKontrolu(satir-1, sutun, mayin, kackare);
            mayinlar+=    mayinKontrolu(satir+1, sutun, mayin, kackare);
            mayinlar+=    mayinKontrolu(satir-1, sutun+1, mayin, kackare); // 0 1
            mayinlar+=   mayinKontrolu(satir-1, sutun-1, mayin, kackare);
            mayinlar+=   mayinKontrolu(satir+1, sutun+1, mayin, kackare);
            mayinlar+=  mayinKontrolu(satir+1, sutun-1, mayin, kackare);
            oyunEkrani[satir][sutun]=mayinlar;
        }
            gerekendgrucvpsayi--;

        }
if (gerekendgrucvpsayi==0){
        System.out.println("TEBRIKLER OYUNU KAZANDINIZ");
}else{
    System.out.println("mayin patladi, gecmis olsun");
}



    }

    private static void printArr(int kackare, int[][] mayin) {
        for (int i = 0; i< kackare; i++) {
            for (int k = 0; k< kackare; k++) {
                if (mayin[i][k]==-1){
                    System.out.print(" ");

                }else {
                    System.out.print("  ");
                }
                System.out.print(""+mayin[i][k]+" ");

            }
            System.out.println();


        }
    }


    public static int mayinKontrolu(int satir, int sutun, int[][] mayin, int kackare){ //
        int sonuc =0;
        if(satir>=0 && sutun>=0 && satir<=kackare-1 && sutun <=kackare-1) {

            if (mayin[satir][sutun] == -1) {
                sonuc = 1;
            }
        }
        return sonuc;
    }

}











