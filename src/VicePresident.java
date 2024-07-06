class VicePresident extends Manager {

    //SUPER CONSTRUCTOR
    VicePresident(String name){
        super(name);
    }

    //METHOD OVERIDING
    void hallo(String name) {
        System.out.println("hallo perkenalkan aku vice president " + name + " " + this.name);
    }
}
