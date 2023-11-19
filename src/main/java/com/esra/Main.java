package com.esra;

public class Main {
    public static void main(String[] args) {
        TurkceString turkceString=new TurkceString("Bu proje sınav öncesi ödevim");

        char harf = turkceString.karakterAl(7);
        System.out.println("7. indeksteki harf: "+ harf);

        System.out.println("İlk 'a' harfinin indeksi: "+turkceString.indexBul("a"));

        String altIfade= turkceString.altIfade(4,7);
        System.out.println(altIfade);

    }
}