package project.source.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Feri";
        String second = first + " susmiyanto";
        System.out.println(second);

        String tird = "Feri susmiyanto";
        System.out.println(tird == second);
        String name = "Feri susmiyanto";
        System.out.println(name == tird);

        System.out.println(second.equals(tird));

    }
}
