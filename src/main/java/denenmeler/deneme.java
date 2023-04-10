package denenmeler;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

    }
    private String name;
    private Double sayi;


    public deneme(String name, Double sayi) {
        this.name = name;
        this.sayi = sayi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSayi() {
        return sayi;
    }

    public void setSayi(Double sayi) {
        this.sayi = sayi;
    }

}
