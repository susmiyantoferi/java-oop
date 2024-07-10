package project.source.data;

public class Bus implements Car{
   public String brand() {
        return "Mercedes";
    }

    public void jalan() {
        System.out.println("jalan");
    }

   public int getTier() {
        return 7;
    }

    public Boolean isBig() {
        return true;
    }

    public Boolean isMaintenance() {
        return false;
    }
}
