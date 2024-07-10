package project.source.data;

public record LoginRequest(String username, String password) {

    public LoginRequest{
        System.out.println("memebuat object record");
    }


    //pada record ketika membuat constructor overloading wajib memanggil constructor utama.
    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
        this("", "");
    }
}
