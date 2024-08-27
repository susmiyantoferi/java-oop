package project.source.application;

import project.source.data.Bio;

public class BioApp {
    public static void main(String[] args) {
        Bio bio = new Bio();

        bio.setName("feri susiyanto");
        bio.setAlamat("tapan");
        bio.setUmur(23);

        System.out.println("nama : " + bio.getName());
        System.out.println("alamat : " + bio.getAlamat());
        System.out.println("umur : " + bio.getUmur());
    }
}
