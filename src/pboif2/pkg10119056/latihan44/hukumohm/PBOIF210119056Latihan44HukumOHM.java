/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan44.hukumohm;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Hukum OHM

**/

public class PBOIF210119056Latihan44HukumOHM {

    public static void main(String[] args) {
        Baterai baterai1=new Baterai();
        Baterai baterai=new Baterai(3,3);
       
        System.out.println("Kuat arus : "+baterai.getKuatArus());
        System.out.println("Hambatan : "+baterai.getHambatan());
        
        System.out.println("Hasil Tegangan : "+baterai.hitungTegangan());
    }
    
}
