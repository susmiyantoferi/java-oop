package project.source.application;

public class Soal4 {

    public static void main(String[] args) {
        int[] array = {8, 3, 15, 11, 4, 12, 7};

        for (int i = 0; i < array.length; i++) {

            for (int a = 0; a < array.length; a++) {

                for (int b = a + 1; b < array.length; b++) {

                    if (array[a] < array[b]) {
                        int temp = array[a];
                        array[a] = array[b];
                        array[b] = temp;
                    }

                }
            }
        }

        System.out.println("data sorting :");
        for (int c = 0; c < 3; c++) {
            System.out.println(array[c]);
        }

    }
}
