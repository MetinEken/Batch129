package day12;

public class deneme2 {
    public static void main(String[] args) {
        String x ="Metin";
        String y ="Metin";

        if (x == "Metin"){
            System.out.println("karsilastirma dogru");
        }
        if (x.equals("Metin")) {
            System.out.println("equals da calisti");
        }
        if (x == y){
            System.out.println("x y karsilastirmasi da calisti");
        }
        if (x.equals(y)) {
            System.out.println("equals x y calisti");
        }
    }
}
