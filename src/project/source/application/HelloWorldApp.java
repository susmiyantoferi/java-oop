package project.source.application;

import project.source.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        //ANNONYMOUS CLASS
        HelloWorld english = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello");
            }

            public void hello(String kata) {
                System.out.println("hello " + kata);
            }
        };


        //ANNONYMOUS CLASS
        HelloWorld indonesia = new HelloWorld() {
            public void sayHello() {
                System.out.println("halo");
            }

            @Override
            public void hello(String kata) {
                System.out.println("halo " + kata);
            }
        };

        english.sayHello();
        english.hello("banyuwangi");

        indonesia.hello("miuncar");
        indonesia.sayHello();
    }
}
