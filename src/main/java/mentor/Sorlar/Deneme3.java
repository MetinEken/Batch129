package mentor.Sorlar;

import java.util.Scanner;

public class Deneme3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Merhaba, lütfen formu doldurunuz.");
        System.out.print("Öğrenci sayısını giriniz: ");
        int numStd=scan.nextInt();

        String[] students=new String[numStd];
        String[] gender=new String[numStd];
        double[] height=new double[numStd];
        double[] weight=new double[numStd];

        boolean isSuccess=true;
        do {
            isSuccess=true;
            for(int i=0;i<numStd;i++){
                System.out.print("isim: ");
                students[i]=scan.next();

                System.out.print("cinsiyet: ");
                String gen=scan.next().toUpperCase().substring(0,1);
                if(gen.equals("K") || gen.equals("E")){
                    gender[i]=gen;
                }else {
                    System.out.println("Hatalı giriş!");
                    isSuccess=false;
                    break;
                }

                System.out.print("boy: ");
                height[i]=scan.nextDouble();

                System.out.print("kilo: ");
                weight[i]=scan.nextDouble();
            }
        }while(!isSuccess);

        int counter=0;
        System.out.println("*** kursa seçilen öğrenciler ***");
        for(int i=0;i<numStd; i++) {
            if(gender[i].equals("K") && height[i]>=1.50 && weight[i]>=50 && weight[i]<=70){
                System.out.println("isim: "+students[i]+" cinsiyet: "+gender[i]+" boy: "+height[i]+ " kilo: "+weight[i]);
                counter++;
            }else if(gender[i].equals("E") && height[i]>=1.60 && weight[i]>=70 && weight[i]<=90){
                System.out.println("isim: "+students[i]+" cinsiyet: "+gender[i]+" boy: "+height[i]+ " kilo: "+weight[i]);
                counter++;
            }
        }
        if(counter==0){
            System.out.println("Malesef kurs gereksinimlerini karşılayan öğrenci bulunamadı.");
        }
    }
}

// bu uygulamanin BUg i ; 2 veya daha fazla ogrenciyi dogru kaydettik ten sonra bir tane hatali cinsiyet girersek,
// ilk kaydettigimiz ogrencileride siliyor, hersey bastan basliyor.

