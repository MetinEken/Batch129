package hastaneOtomasyon.model;

public class ParentClass {
    private String name;
    private String lastNAme;
    private int yas;
    private String kimlikNo;

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public ParentClass() {
    }

    public ParentClass(String name, String lastNAme, int yas,String kimlikNo) {
        this.name = name;
        this.lastNAme = lastNAme;
        this.yas = yas;
        this.kimlikNo = kimlikNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
