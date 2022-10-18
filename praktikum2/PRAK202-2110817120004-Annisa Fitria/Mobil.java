/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author HP
 */
public class Mobil {
  
    // deklarasi
    String merek,pemilik;
    int kapasitas;
    float harga,pajak;
    String tahun_keluaran;
    
    
    public void setpemilik(String milik){
         pemilik = milik;
     }
    public void setPajak(int pk){
        pajak = pk;
    }

     public String getPemilik(){
         return pemilik;
     }

    public float getPajak(){
        return pajak = harga * 2f/100f;
    }
    
   //method
   public void tampilkan(){ 
   System.out.println("Merek Mobil " + merek);
   System.out.println("Harga :"+harga);
   System.out.println("Tahun keluaran :"+tahun_keluaran);
   System.out.println("Kapasitas :"+kapasitas);
}

    void setPemilik(String kasel) {
        this.pemilik = kasel;
    }
}
  
     
    
