import java.beans.Visibility;

class PolymorphismeApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Geraldi");
        employee.hallo("Leci");

        employee = new Manager("zufar");
        employee.hallo("Fadel");

        employee = new VicePresident("yuras");
        employee.hallo("aan");

        //POLYMORPHISM ON METHOD
        hai(new Employee("Leci Geraldi"));
        hai(new Manager("Fadel zufar"));
        hai(new VicePresident("aan yuras"));

        sayHello(new Employee("Leci Geraldi"));
        sayHello(new Manager("Fadel zufar"));
        sayHello(new VicePresident("aan yuras"));
    }


    static void hai(Employee employee) {
        System.out.println("HAI " + employee.name);
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("HAI vice presidance " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("HAI manager " + manager.name);
        } else {
            System.out.println("HAI " + employee.name);
        }
    }
}
