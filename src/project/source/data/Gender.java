package project.source.data;

import java.util.logging.Level;

public enum Gender {
    MALE("laki-laki"),
    FEMALE("perempuan");

    String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription(){
         return description;
    }

}
