/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan44.hukumohm;

/**
 *
 * @author ACER
 */

public class Baterai{
    private float kuatArus;
    private float hambatan;
    
    public Baterai(){
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar\nakan berbanfing lurus dengan beda potensial\npada ujung-ujung kawat penghantar tersebut\nasalkan suhu kawat dijaga konsisten.");
        System.out.println();
    }
    
    public Baterai(float kuatArus, float hambatan){
        this.kuatArus=kuatArus;
        this.hambatan=hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitungTegangan(){
        return kuatArus*hambatan;
    }
}
