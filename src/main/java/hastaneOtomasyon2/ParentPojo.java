package hastaneOtomasyon2;

public class ParentPojo {

    private String isim;
    private String soyAd;
    private int yas;
    private String kimlikNo;




    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public ParentPojo() {
    }

    public ParentPojo(String isim, String soyAd, int yas, String kimlikNo) {
        this.isim = isim;
        this.soyAd = soyAd;
        this.yas = yas;
        this.kimlikNo = kimlikNo;
    }
    @Override
    public String toString() {
        return "Doktor" +
                "isim='" + isim + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                ", kimlikNo='" + kimlikNo + '\''
                ;
    }
}