/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/
package com.mycompany.praktikum30042026;

/**
 *
 * @author Rahmi Aulia
 */
public class Kucing extends Hewan {
    public Kucing(String nama){
        super(nama);
    }
    
    @Override
    public void bersuara(){
        super.bersuara();
        System.out.println(nama + " bersuara: Meong!");
    }
    
}
