public class TeknologiApp {

    public static void main(String[] args) {

        var teknologi = new Teknologi("Laptop Asus vivobook", "asus industries");

        System.out.println(teknologi.nama);
        System.out.println(teknologi.brand);
        System.out.println(teknologi.jumlah);
        teknologi.sayHello("Feri susmiyanto");


        Teknologi teknologi1 = new Teknologi("Laptop Dell XPS 13");
        teknologi1.sayHello("Agus salim");

        Teknologi teknologi2 = new Teknologi();
        teknologi2.nama = "Lapotop Macbook 15";
        teknologi2.brand = "apple industries";
        teknologi2.sayHello("Fajar yuris");

        System.out.println(teknologi2.brand);
    }

}
