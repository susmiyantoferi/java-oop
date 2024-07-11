package project.source.application;

import project.source.data.CreateUserRequest;
import utils.ValidationUtils;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest createUserRequest = new CreateUserRequest();

        createUserRequest.setUsername("iref");
        createUserRequest.setPassword("rahasia");
        createUserRequest.setName(null);
        ValidationUtils.validationReflection(createUserRequest);
    }
}
