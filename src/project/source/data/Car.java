package project.source.data;

public interface Car extends Brand, IsMaintenance{
     void jalan();

     int getTier();

     default Boolean isBig(){
          return true;
     }
}
