package project.source.application;

import project.source.error.DatabaseException;

public class DatabaseError {
    public static void main(String[] args) {
        databaseConnection("iref", "rahasia");
        System.out.println("SUKSES");


    }

    public static void databaseConnection(String username, String password){
        if (username == null || password == null){
            throw new DatabaseException("gagal koneksi ke database");
        }
    }
}


