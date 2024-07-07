package project.source.data;

public class Toyota implements Car{

   public void jalan() {
       System.out.println("Toyota test jalan");
    }

    public int getTier() {
        return 7;
    }

   public String brand() {
        return "Toyota avanza";
    }

    public Boolean isMaintenance() {
        return false;
    }
}
