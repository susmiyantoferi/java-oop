package project.source.application;

import project.source.data.Customer;
import project.source.data.Gender;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.setName("Feri");
        customer.setGender(Gender.MALE);

        System.out.println(customer.getName());
        System.out.println(customer.getGender());
        System.out.println(customer.getGender().getDescription());

        //conversi enum to string
        String nameGender = Gender.FEMALE.name();
        System.out.println(nameGender);

        //conversi string to enum
        Gender gender = Gender.valueOf("MALE");
        System.out.println(gender);

        //cek all enum
        System.out.println("print all enum: ");
        for (var valeu : Gender.values()){
            System.out.println(valeu);
        }
    }
}
