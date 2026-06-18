/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/
package com.mycompany.praktikum30042026;

/**
 *
 * @author Rahmi Aulia
 */
public class Hewan {
    
    protected String nama;
    
    public Hewan (String nama) {
        this.nama = nama;
    }
    
    public void bersuara(){
        System.out.println("Hewan bersuara...");
    }
    
    public void tampilkanNama(){
       System.out.println("Nama hewan:"); 
    }
}
