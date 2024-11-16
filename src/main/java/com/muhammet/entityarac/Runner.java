package com.muhammet.entityarac;

public class Runner {
    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.model = "";

        Motosiklet motosiklet = new Motosiklet();
        motosiklet.calistir();

        araba.calistir();

      double mtv = motosiklet.mtvHesapla(240_000);
      System.out.println("motosiklet.mtvHesapla: " + mtv);

      mtv = araba.mtvHesapla(2_250_000);
      System.out.println("araba.mtvHesapla: " + mtv);

    }
}
