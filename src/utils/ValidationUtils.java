package utils;

import project.source.data.LoginRequest;
import project.source.error.BlankException;
import project.source.error.ValidationException;

import javax.swing.text.BadLocationException;

public class ValidationUtils {

    //checked exception wajib trows valdationexception dll.
    public static void validate(LoginRequest loginRequest) throws ValidationException{
        if (loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        }if (loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }


    //runtime exception tidak wajib throws
    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        }if (loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }
}
