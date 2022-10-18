/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author HP
 */
public class mangga {
  
    // deklarasi
    String nama;
    int jumlah,totalharga;
    float berat,totalberat;
    
    //construc
    public mangga ( String nama, float berat, int jumlah, float totalberat, int totalharga) {
    
    // this merujuk deklarasi
    this.nama = nama;
    this.berat = berat;
    this.jumlah = jumlah;
    this.totalberat = totalberat;
    this.totalharga = totalharga;
    }
   //method
   public void tampilkan(){ 
   System.out.println("Nama Mangga :" + nama);
   System.out.println("Berat: "+ berat);
   System.out.println("Jumlah Beli : "+jumlah);
   System.out.println("Total berat : "+totalberat);
   System.out.println("Total harga : "+totalharga);
   
       System.out.println("");
}
         
    
}

    
