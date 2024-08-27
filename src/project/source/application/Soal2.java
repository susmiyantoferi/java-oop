package project.source.application;

public class Soal2 {
    public static void ganjil(int n) {
        int hasil;
        for (int i = 0; i < n; i++) {
            hasil = 2 * i + 1;
            System.out.printf(hasil + " ");
        }
    }

    public static void main(String[] args) {
        int n = 12;
        ganjil(n);
        System.out.println();
        int n1 = 15;
        ganjil(n1);
    }
}
