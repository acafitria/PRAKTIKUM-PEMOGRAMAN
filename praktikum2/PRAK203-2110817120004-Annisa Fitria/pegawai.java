/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author HP
 */
//public class employee {  pada baris ini  tidak dapat menggunakan public class employee , karena nama filenya adalah pegawai. Jika ingin menggunakan public class makan harus menggati nama file menjadi employee.java 
 public class pegawai{
 public String nama;
 public String asal; // tipe data char harusnya string karena untuk menampung data asal memiliki lebih dari satu huruf (char)
 public String jabatan;
 public int umur;
 public String getNama() {
 return nama;
 }
 public String getAsal() {
 return asal;
 }
 public void setJabatan(String jabatan) {
 this.jabatan = jabatan; // = harus diisi sesuai yang di deklarasikan
 }
 }
    
