package project.source.application;

public class Soal3 {

    public static double hitung(String jenis, int lama) {
        double harga = 0;

        if (jenis == "motor" || jenis == "Motor") {
            if (lama <= 1) {
                harga = 3000;
            } else {
                harga = 3000 + (lama - 1) * 1000;
            }
        }

        if (jenis == "mobil" || jenis == "Mobil") {
            if (lama <= 1) {
                harga = 5000;
            } else {
                harga = 5000 + (lama - 1) * 2000;
            }
        }

        return harga;
    }

    public static void main(String[] args) {
        String jenis = "motor";
        int lama = 3;
        double total = hitung(jenis, lama);
        System.out.println("total bayar motor Rp." + total);

        String jenis1 = "mobil";
        int lama1 = 7;
        double total1 = hitung(jenis1, lama1);
        System.out.println("total bayar mobil Rp." + total1);
    }
}
