/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal2;

public class Komik extends Buku {
     private int volume;
    private String sinopsis;

    public Komik(String judul, String penulis, String tahun, int volume, String sinopsis){
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = Integer.parseInt(tahun);
        this.volume = volume;
        this.sinopsis = sinopsis;
    }
    public String getKomikDetail() {
        return "\nData yang baru di inputkan adalah Sebuah Komik dengan judul " + judul
                + ".\nKomik  tersebut dibuat oleh " + penulis + " dan diterbitkan pada tahun " + tahun
                + " .Sampai saat ini\nkomik tersebut memiliki jumlah volume sebanyak " + volume + " buah."
                + "\nSinopsis : " + sinopsis.substring(0, 64) + "...";
    } 
}