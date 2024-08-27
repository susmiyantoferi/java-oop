package project.source.application;

public class BubbleShortApp {

    public static void main(String[] args) {

        int[] umur = {20, 29, 30, 18, 17, 15, 35, 10};
        System.out.println("belum sorting :");

        for (int i = 0; i < umur.length; i++) {
            //data belum sorting
            System.out.println(umur[i]);

            //sorting
            for (int a = 0; a < umur.length; a++) {

                for (int b = a + 1; b < umur.length; b++) {

                    if (umur[a] < umur[b]) {
                        int temp = umur[a];
                        umur[a] = umur[b];
                        umur[b] = temp;
                    }

                }
            }
        }

        System.out.println("data sorting :");
        for (int c = 0; c < umur.length; c++) {
            System.out.println(umur[c]);
        }

    }
}
