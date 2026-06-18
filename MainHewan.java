/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/
package com.mycompany.praktikum30042026;

/**
 *
 * @author Rahmi Aulia
 */
public class MainHewan {
    
    public static void main(String[] args) {
        Hewan hewanUmum = new Hewan ("Makhluk");
        Kucing kucingku = new Kucing ("Mimi");
        Anjing anjingku = new Anjing ("Bobby");
        
        hewanUmum.tampilkanNama();
        hewanUmum.bersuara();
        
        System.out.println();
        
        kucingku.tampilkanNama();
        kucingku.bersuara();
        
        System.out.println();
        
        anjingku.tampilkanNama();
        anjingku.bersuara();
        
        System.out.println();
        
    }
}
