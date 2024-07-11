package project.source.application;

import project.source.data.LoginRequest;
import project.source.error.ValidationException;
import utils.ValidationUtils;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("feri", "rahasia");

        try {
            ValidationUtils.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak Valid " + exception.getMessage());
        } finally {
            System.out.println("Ini selalu dieksekusi mau error / tidak error");
        }
//        catch (NullPointerException exception) {
//            System.out.println("data null " + exception.getMessage());
//        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtils.validateRuntime(loginRequest2);
        System.out.println("sukses");
    }
}
