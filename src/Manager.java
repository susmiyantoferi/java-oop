class Manager extends Employee{
    String address;

    Manager(String name){
        super(name);
    }

    Manager(String name, String address){
        super(name);
        this.address = address;
    }

    void hallo(String name) {
        System.out.println("hallo perkrnalkan aku manager " + name + " " + this.name);
    }
}
