package utils;

import project.source.anotation.NotBlank;
import project.source.data.LoginRequest;
import project.source.error.BlankException;
import project.source.error.ValidationException;

import javax.swing.text.BadLocationException;
import java.lang.reflect.Field;
import java.util.Objects;

public class ValidationUtils {

    //checked exception wajib trows valdationexception dll.
    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        }
        if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }


    //runtime exception tidak wajib throws
    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        }
        if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                //validated
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()) {
                        throw new BlankException("field " + field.getName() + " is balnk");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("tidak bisa mengakses fiels " + exception.getMessage());
                }
            }
        }

    }
}
