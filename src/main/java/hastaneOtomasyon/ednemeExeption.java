package hastaneOtomasyon;

import java.util.Scanner;

public class ednemeExeption {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int d = 1/0;
            {

            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("=================");
            System.out.println(e.getCause());
            System.out.println("=================");
            System.out.println(e.getMessage());
            System.out.println("=================");
            System.out.println(e.getLocalizedMessage());
        }
    }
}