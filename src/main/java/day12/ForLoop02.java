package day12;

public class ForLoop02 {
    public static void main(String[] args) {


        for (int i=1; i<=5; i++ ){
            for(int x=1; x<=i; x++){
                System.out.print(x);
            }
            System.out.println();
    }

        for (int i=5; i>=1; i-- ){


            for(int x=i; x>=1; x--){
                System.out.print("*"+" ");
            }
            System.out.println();

    }
}}
