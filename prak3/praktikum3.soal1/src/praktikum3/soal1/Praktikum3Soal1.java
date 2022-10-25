/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3.soal1;
import java.util.Scanner; // mengimport paket scanner kedalam kode
public class Praktikum3Soal1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // berfungsi mmebuat scanner baru paket scanner kedalam kode

        Dadu d = new Dadu(); //menggunakan scanner untuk menyimpan apa yang dimasukan di variabel d
        int jumlahdadu = input.nextInt(); // perintah untuk memasukan angka yg ingin di input tipe data integer

        d.setInput (jumlahdadu);// untuk memanggil jumlah dadu
        d.acaknilai ();
        d.tampil();
    }
}
