/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author HP
 */
public class soal3main {
 public static void main(String[] args) {
 pegawai p1 = new pegawai();
 // p1.nama = "Roi" // pada baris ini kurang tanda titik koma (;)
 p1.nama = "Roi"; 
 p1.asal = "Kingdom of Orvel";
 p1.setJabatan("Assasin");
 //// Kurang integer  umur
 p1.umur =(17);
 
 // System.out.println("Nama pegawai: " + p1.getNama()); pada baris ini kuang sesuai dengan output yang mana pertanyaan nya adalah nam saja bukan nama pegawai
 System.out.println("Nama: " + p1.getNama());
 System.out.println("Asal: " + p1.getAsal());
 System.out.println("Jabatan: " + p1.jabatan);
 //System.out.println("Umur: " + p1.umur); pada baris juga kurang sesuai yaitu ketinggalan kata tahun 
 System.out.println("Umur: " + p1.umur +"tahun");
 }
    
}
