package project.source.application;

public class Soal1 {

    public static void main(String[] args) {
        System.out.println("a.");
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b < a; b++) {
                System.out.printf(" ");
            }
            for (int c=9; c>a; c--){
                System.out.printf("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("b.");
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("c.");
        for (int a = 0; a <= 9; a++) {
            for (int b = 9; b > a; b--) {
                System.out.printf(" ");
            }
            for (int c=0; c<a; c++){
                System.out.printf("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("d.");
        for (int a = 0; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
