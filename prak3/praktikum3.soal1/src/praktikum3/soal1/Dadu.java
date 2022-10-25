/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal1;
import java.util.LinkedList; // berfungsi unutk mengimport inkedlist yang telah dibuat
public class Dadu {public int jumlahdadu;//construct
    int total;

    public void setInput(int jumlahdadu)
    {
        this.jumlahdadu = jumlahdadu; // merujuk deklarasi
    }

    void acaknilai(){ // method
        for (int i = 0; i<jumlahdadu; i++){
            int acak = 1 + (int)(Math.random() * 6); // math random berfungsi sebagai function pengacak dengan1 sebgai range dan 6 sng batasan nilai eksklusif
            System.out.println("Dadu ke-" + (i+1) + " bernilai "+acak);// tampilkan
            total += acak; // perhitungan total
        }
    }

    void tampil(){ // method
        System.out.println("Total Nilai Dadu Keseluruhan "+ total); //tampilkan
    }
}
