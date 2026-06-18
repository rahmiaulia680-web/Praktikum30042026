/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/ 
package com.mycompany.praktikum30042026;

/**
 *
 * @author Rahmi Aulia
 */
public class Udara extends Kendaraan{
    private boolean mesin; 
   
    public Udara() {
        super();
        mesin = false;
    }

    public Udara(String nama, int tahunProduksi, boolean mesin) {
        super(nama, tahunProduksi);
        this.mesin = mesin;
    }

    public boolean getMesin() {
        return mesin;
    }

    public void setMesin(boolean mesin) {
        this.mesin = mesin;
    }

   
    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Menggunakan Mesin : " + mesin);
    }
}
