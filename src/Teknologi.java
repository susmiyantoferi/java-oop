public class Teknologi {
    String nama;
    String brand;
    final Integer jumlah = 10;

    //CONSTRUCTOR OVERLOADING
    Teknologi(String paramNama, String paramBrand){
        nama = paramNama;
        brand = paramBrand;
    }

    //contructor overloading memanggil constructor
    Teknologi(String paramNama){
        this(paramNama, null);
    }

    Teknologi(){
        this(null);
    }

    void sayHello(String paramName){
        System.out.println("hallo " + paramName + " " + nama);
    }


}
