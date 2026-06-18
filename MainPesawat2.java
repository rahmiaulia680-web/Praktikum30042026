/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/
package com.mycompany.praktikum30042026;

import java.util.Scanner;

/**
 *
 * @author Rahmi Aulia
 */
public class MainPesawat2 {
    public static void main(String[] args){
        //TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan jumlah pesawat: ");
        int jumlah = input.nextInt(); //Buang newline
        
        Pesawat[] daftarPesawat = new Pesawat[jumlah];
        
        for(int i = 0; i < jumlah; i++ )
            System.out.println("\n=== Input Data Pesawat ke-" + (i + 1) + "===");
            
            System.out.print("Nama Pesawat: ");
            String nama = input.nextLine();
            
            System.out.println("\nTahun Produksi: ");
            int tahunProduksi = input.nextInt();
            
            System.out.print("\nMenggunakan Mesin? (true/false): ");
            boolean mesin = input.nextBoolean();
            
            System.out.print("\nMuatan (jumlah penumpang): ");
            int muatan = input.nextInt();
            input.nextLine(); //Buang newline 
            
            daftarPesawat[1] = new Pesawat(nama, tahunProduksi, mesin, muatan);    
    
    
      System.out.println("\n=== DAFTAR PESAWAT ===");
    System.out.println(">> Pesawat ke- 1");
         daftarPesawat[0].cetak();
         
         int max = daftarPesawat[0].getMuatan();
         String maxnama = daftarPesawat[0].getNama();
       for (int i =1; i < daftarPesawat.length; i++){
         System.out.println(">> Pesawat ke-" + (i + 1));
         daftarPesawat[i].cetak();
         if(daftarPesawat[i].getMuatan()>max)
         {
           max = daftarPesawat[i].getMuatan();
           maxnama = daftarPesawat[i].getNama();
         }
         System.out.println();   
       }
}
}
