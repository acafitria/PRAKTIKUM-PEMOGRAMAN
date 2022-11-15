/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal1;

public class buku {
    private String judul;
    private String penulis;
    private int tahun;
    
    public buku(String judul, String penulis, int tahun){
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }

    public void display(){
        System.out.println("\nDetail buku :");
        System.out.println("Judul adalah " + judul );
        System.out.println("penulis adalah" +penulis);
        System.out.println("tahun Terbit adalah" +tahun);
           
             
    }
}
