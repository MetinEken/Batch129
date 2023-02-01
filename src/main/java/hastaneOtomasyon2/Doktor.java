package hastaneOtomasyon2;

public class Doktor extends ParentPojo{


    private int id;
    private String bolum;
    static int counter=1000;
   private String sifre;





    public String getSifre() {
        return sifre;
    }

    public void setSigre(String sifre) {
        this.sifre = sifre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public Doktor() {
    }

    public Doktor( String bolum,String isim, String soyAd, int yas,String kimlikNo,String sifre) {
        super(isim, soyAd, yas, kimlikNo);
        this.sifre=sifre;
        this.id = counter;
        counter++;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return super.toString()
                + "id=" + id +
                ", bolum='" + bolum ;

    }
}