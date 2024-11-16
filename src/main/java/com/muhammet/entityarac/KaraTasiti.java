package com.muhammet.entityarac;

public class KaraTasiti {
    public Long id;
    public String marka;
    public String model;
    public String yakitTuru;
    public int vitesSayisi;
    public int tekerSayisi;
    public String tekerTuru;
    public int hiz;
    public int maxHiz;
    public int yolcuSayisi;
    public int yolcuKapasitesi;
    public int tork;
    public double ekMtv= .25;
    public void calistir(){
        System.out.println("Araç Çalıştı");
    }

    public double mtvHesapla(double fiyat){
        return ekMtv *  fiyat;
    }

}
