/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3.soal2;
import java.util.* ;
import java.util.Scanner;


public class Praktikum3Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //deklarasi
        String nama = "", jenis="", pemimpin="";
        int tgl=0, bulan=0, tahun=0;
        Scanner input = new Scanner(System.in); // mebuat scanner baru paket scanner kedalam kode
        Negara negara = new Negara(nama, jenis, pemimpin, tgl, bulan, tahun);//hasil scanner baru yang dibuat di atas yang mana variable ini yang menyimpan apa yang masukan dalam n isi nilai yang disimpan n nama, jenis, pemimpin, tanggal, bulan, tahun
        LinkedList<Negara> llNegara = new LinkedList<Negara>();//membuat list dengan nama varieble Negara sehingga menyimpan beberapa objek dengan typdat yang sama

        int ulang;// untuk penginputan type integer
        ulang = input.nextInt();

        for (int i=0; i<ulang; i++){
            Negara n = new Negara(nama, jenis, pemimpin, tgl, bulan ,tahun);
            n.getData();
            llNegara.add(n);
        }

        for (int i = 0; i < llNegara.size(); i++){
            Negara nIndex = llNegara.get(i);
            nIndex.tampilkan();
    }
    }
}


   