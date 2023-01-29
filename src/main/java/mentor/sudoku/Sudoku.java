package mentor.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Sudoku {
    public static void main(String[] args) {
        List<Integer> x1 = new ArrayList<>();
        List<Integer> x2 = new ArrayList<>();
        List<Integer> x3 = new ArrayList<>();
        List<Integer> x4 = new ArrayList<>();
        List<Integer> x5 = new ArrayList<>();
        List<Integer> x6 = new ArrayList<>();
        List<Integer> x7 = new ArrayList<>();
        List<Integer> x8 = new ArrayList<>();
        List<Integer> x9 = new ArrayList<>();

        List<Integer> y1 = new ArrayList<>();
        List<Integer> y2= new ArrayList<>();
        List<Integer> y3 = new ArrayList<>();
        List<Integer> y4 = new ArrayList<>();
        List<Integer> y5 = new ArrayList<>();
        List<Integer> y6 = new ArrayList<>();
        List<Integer> y7 = new ArrayList<>();
        List<Integer> y8= new ArrayList<>();
        List<Integer> y9 = new ArrayList<>();

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        List<Integer> l4 = new ArrayList<>();
        List<Integer> l5 = new ArrayList<>();
        List<Integer> l6 = new ArrayList<>();
        List<Integer> l7 = new ArrayList<>();
        List<Integer> l8 = new ArrayList<>();
        List<Integer> l9 = new ArrayList<>();



        sudokuMenu(x1,x2,x3,x4,x5,x6,x7,x8,x9,y1,y2,y3,y4,y5,y6,y7,y8,y9,l1,l2,l3,l4,l5,l6,l7,l8,l9);



    }

    private static void sudokuMenu(List<Integer> x1, List<Integer> x2, List<Integer> x3, List<Integer> x4, List<Integer> x5, List<Integer> x6, List<Integer> x7, List<Integer> x8, List<Integer> x9, List<Integer> y1, List<Integer> y2, List<Integer> y3, List<Integer> y4, List<Integer> y5, List<Integer> y6, List<Integer> y7, List<Integer> y8, List<Integer> y9, List<Integer> l1, List<Integer> l2, List<Integer> l3, List<Integer> l4, List<Integer> l5, List<Integer> l6, List<Integer> l7, List<Integer> l8, List<Integer> l9) {
        int sayi = (int) (Math.random()*10);
        if(l1.size()<9){
            if (l1.contains(sayi) && x1.contains(sayi) ){
                sudokuMenu(x1,x2,x3,x4,x5,x6,x7,x8,x9,y1,y2,y3,y4,y5,y6,y7,y8,y9,l1,l2,l3,l4,l5,l6,l7,l8,l9);
            }else {
                l1.add(sayi);
                x1.add(sayi);

            }

        }
        l2.add(x1.get(3));
        l2.add(x1.get(4));
        l2.add(x1.get(5));
        l3.add(x1.get(6));
        l3.add(x1.get(7));
        l3.add(x1.get(8));
        x2.add(l1.get(3));
        x2.add(l1.get(4));
        x2.add(l1.get(5));
        x3.add(l1.get(6));
        x3.add(l1.get(7));
        x3.add(l1.get(8));
        sudoku2(x1,x2,x3,x4,x5,x6,x7,x8,x9,y1,y2,y3,y4,y5,y6,y7,y8,y9,l1,l2,l3,l4,l5,l6,l7,l8,l9);

    }

    private static void sudoku2(List<Integer> x1, List<Integer> x2, List<Integer> x3, List<Integer> x4, List<Integer> x5, List<Integer> x6, List<Integer> x7, List<Integer> x8, List<Integer> x9, List<Integer> y1, List<Integer> y2, List<Integer> y3, List<Integer> y4, List<Integer> y5, List<Integer> y6, List<Integer> y7, List<Integer> y8, List<Integer> y9, List<Integer> l1, List<Integer> l2, List<Integer> l3, List<Integer> l4, List<Integer> l5, List<Integer> l6, List<Integer> l7, List<Integer> l8, List<Integer> l9) {
        int sayi = (int) (Math.random()*10);

        if(l2.size()<9){
            if (l2.contains(sayi) && x2.contains(sayi) && y1.contains(sayi)){
                sudokuMenu(x1,x2,x3,x4,x5,x6,x7,x8,x9,y1,y2,y3,y4,y5,y6,y7,y8,y9,l1,l2,l3,l4,l5,l6,l7,l8,l9);
            }else {
                l2.add(sayi);
                x2.add(sayi);
            }   }


        sudoku2(x1,x2,x3,x4,x5,x6,x7,x8,x9,y1,y2,y3,y4,y5,y6,y7,y8,y9,l1,l2,l3,l4,l5,l6,l7,l8,l9);
    }
}
