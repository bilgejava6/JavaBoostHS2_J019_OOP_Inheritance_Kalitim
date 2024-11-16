package com.muhammet;

import com.muhammet.entity.Hizmetli;
import com.muhammet.entity.Mudur;
import com.muhammet.entity.Muhasebeci;
import com.muhammet.entity.Muhendis;

public class Runner {
    //static Mudur mudur = new Mudur();
    public static void main(String[] args) {
        /**
         * Inheritance - Kalıtım, Miras Bırakma
         * DİKKAT!!!!
         * bir sınıf içinde yaratılan nesnenin dğeişken değerleri vardır,
         * bu değişkenlere değer tanmamış ise,
         * primitive tipler default değerlerini alır,
         * references tipler ise null değer içerirler. yani adresleri yoktur.
         */
        Mudur mudur = new Mudur(); //
        Hizmetli hizmetli = new Hizmetli();
        Muhasebeci muhasebeci = new Muhasebeci();
        Muhendis muhendis = new Muhendis();

        System.out.println("""
                *** Değer Atmadan Önce ****
                """);
        System.out.println("Müdür değişkeni...: "+ mudur);
        System.out.println("Müdür adı....: "+ mudur.ad);
        System.out.println("Müdür adres..: "+ mudur.adres);
        System.out.println("Müdür email..: "+ mudur.email);
        System.out.println("Müdür yaş....: "+ mudur.yas);
        System.out.println("Müdür Mkt....: "+ mudur.maasKatSayisi);

        mudur.id = 345L;
        mudur.maasKatSayisi = 600;
        mudur.yas = 36;
        mudur.email = "selim@buyukkaynak.com";
        mudur.ad = "Selim TAŞ";
        mudur.adres = "İzmir";
        System.out.println("""
                ***** Değer Atadıktan Sonra *******
                """);
        System.out.println("Müdür değişkeni...: "+ mudur);
        System.out.println("Müdür adı....: "+ mudur.ad);
        System.out.println("Müdür adres..: "+ mudur.adres);
        System.out.println("Müdür email..: "+ mudur.email);
        System.out.println("Müdür yaş....: "+ mudur.yas);
        System.out.println("Müdür Mkt....: "+ mudur.maasKatSayisi);



    }
}