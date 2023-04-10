package yazBoz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Arac {
    private String marka;
    private String model;
    List<Date> rezervTarihler = new ArrayList<>();

    public Arac() {
    }

    public Arac(String marka, String model, List<Date> rezervTarihler) {
        this.marka = marka;
        this.model = model;
        this.rezervTarihler = rezervTarihler;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Date> getRezervTarihler() {
        return rezervTarihler;
    }

    public void setRezervTarihler(List<Date> rezervTarihler) {
        this.rezervTarihler = rezervTarihler;
    }
}
