package hastaneOtomasyon.model;

public class Doktor extends ParentClass {

    private String bolum;

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public Doktor(String bolum) {
        this.bolum = bolum;
    }

    public Doktor(String name, String lastNAme, int yas, String bolum, String kimlikNo) {
        super(name, lastNAme, yas,kimlikNo);
        this.bolum = bolum;
    }

//    @Override
//    public String toString() {
//        return "Doktor{" +
//                "bolum='" + bolum + '\'' +"NAme = "+getName()+ '\''+" LastName = "+getLastNAme()+
//                '}';
//    }


    @Override
    public String toString() {
        return "Doktor{" +
                "bolum='" + bolum + '\'' +
                "} " + super.toString();
    }
}
