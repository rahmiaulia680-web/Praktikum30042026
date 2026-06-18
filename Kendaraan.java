/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/
package com.mycompany.praktikum30042026;

/**
 *
 * @author Rahmi Aulia
 */
public class Kendaraan {
    private String nama;
    private int tahunProduksi;
    
    public Kendaraan(){
    }
    
    public Kendaraan(String nama, int tahunProduksi){
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getTahunProduksi(){
        return tahunProduksi;
    }
    
    public void setTahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }
    
    public void cetak(){
        System.out.println("nama Kendaraan = " +nama);
        System.out.println("Tahun Produksi = " +tahunProduksi);
    }
    
}
