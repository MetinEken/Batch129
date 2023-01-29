package mentor.market1;

public class Urunler {
    int id;
    String name;
    double fiyat;

    public Urunler() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Urunler" +
                "  id=" + id +
                ", name = " + name + '\'' +
                ", fiyat = " + fiyat ;
    }
}
