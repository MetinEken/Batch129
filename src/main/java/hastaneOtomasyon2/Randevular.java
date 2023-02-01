package hastaneOtomasyon2;

public class Randevular extends ParentPojo{


    private boolean aciliyet;
    private String durum;

private Doktor doktor;

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public boolean isAciliyet() {
        return aciliyet;
    }

    public void setAciliyet(boolean aciliyet) {
        this.aciliyet = aciliyet;
    }

    public String getDurum() {
        return durum;
    }

    public Randevular() {
    }

    public Randevular(boolean aciliyet, String durum, String isim, String soyAd, int yas, String kimlikNo, Doktor doktor) {
        super(isim, soyAd, yas, kimlikNo);
        this.aciliyet = aciliyet;
        this.durum = durum;
        this.doktor = doktor;

    }
    public void setDurum(String durum) {
        this.durum = durum;
    }

    @Override
    public String toString() {
        return "Randevulariniz = "+"Isminiz Soyisim: "+ getIsim()+ " "+getSoyAd()+" KimlikNO : "+getKimlikNo()+" Yas : "+getYas()+
                " aciliyet=" + aciliyet +
                ", durum='" + durum + '\'' +
                ", Bolum = " + doktor.getBolum()+" Doktor Ismi soyisim : "+doktor.getIsim()+" "+doktor.getSoyAd() ;
    }
}