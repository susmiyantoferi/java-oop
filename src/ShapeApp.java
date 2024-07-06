public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println("Get corner shape dengan sisi " + shape.getCorner());

        var rectangle = new Rectangle();
        System.out.println("Get corner rectangle dengan sisi " + rectangle.getCorner());
        System.out.println("Get corner rectangle dengan sisi " + rectangle.getParentCorner());
    }
}
