/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal2;

public class Novel extends Buku {
 private String genre;
 private String sinopsis;

    public Novel (String judul, String penulis, String tahun, String genre, String sinopsis){
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = Integer.parseInt(tahun);
        this.genre = genre;
        this.sinopsis = sinopsis;
    }
    public String getNovelDetail(){
        return "\nData yang baru di inputkan adalah Sebuah novel bergenre Drama dengan judul " + judul
        + " .\nNovel  tersebut ditulis oleh " + penulis + " dan diterbitkan pada tahun " + tahun
        + " . \nSinopsis : " + this.sinopsis.substring(0, 59) + "...";
    }   
    
}
