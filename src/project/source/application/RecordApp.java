package project.source.application;

import project.source.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("feri", "Terserah");

        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

        //constructor overloading
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("eko"));
        System.out.println(new LoginRequest("eko", "rahasia"));
    }
}
