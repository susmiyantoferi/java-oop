// VARIABLE HIDING (tidak disarankan)
class Parent {
    String name;

    void doIt(){
        System.out.println("dilakukan di Parent");
    }
}

class Child extends Parent{
    //String name;
    void doIt(){
        System.out.println("dilakukan di Child " + super.name);
    }
}
