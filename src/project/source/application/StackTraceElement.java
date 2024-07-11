package project.source.application;


//mencari tahu penyebab error yang terjadi / cara debugger di java
public class StackTraceElement {
    public static void main(String[] args) {

        try {
            String[] name = {
                    "feri", "susmiyanto", "banyuwnagi"
            };

            System.out.println(name[100]);

        } catch (Throwable throwable){
            throwable.printStackTrace();
        }

    }
}
