package project.source.data;

//ENKAPSULATION
public class Category {
    private String id;
    private Boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }

    }

    public Boolean getExpensive() {
        return expensive;
    }

    public void setExpensive(Boolean expensive) {
        this.expensive = expensive;
    }
}
