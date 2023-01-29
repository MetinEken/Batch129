package mentor.denem3;

public class Runner {

    public static void main(String[] args) {


        mainMethod1();

        Yardimci yrd = new Yardimci();

        yrd.hesapla();

      int gelen =  yrd.hesapla(13, 17);

        System.out.println(" gelen cevap : "+ gelen);


    }


    public static void mainMethod1(){
        System.out.println("mainMethod1 calsti bitti ");
    }
}
