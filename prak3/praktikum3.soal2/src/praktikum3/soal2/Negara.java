package praktikum3.soal2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
public class Negara { //a
    //buat atribut b
  private String nama, jenis, pemimpin;
    private int tgl, bulan, tahun;
// construct
    public Negara(String nama, String jenis, String pemimpin, int tgl, int bulan, int tahun){
        this.nama = nama;
        this.jenis = jenis;
        this.pemimpin = pemimpin;
        this.tgl = tgl;
        this.bulan = bulan;
        this.tahun= tahun;
    }
//lcolection dengan tipe LinkedList
    public int getBulan(){
        return bulan;
    }

    void getData(){// method
        Scanner scn = new Scanner(System.in);//berfungsi mmebuat scanner baru paket scanner kedalam kode
        nama=scn.nextLine();//untuk memasukan input variabel tersebut dengna tipe string
        jenis=scn.nextLine(); //equalsIgnoreCase membandingkan dua string yaitu antara presiden dan perdana mentri yang artinya jenis kepemimpinan itu ada 2 presiden atau perdana mentri dan bernilai sama 
//Metode ini mengembalikan nilai true jika string sama, 
       pemimpin=scn.nextLine();
        if (jenis.equalsIgnoreCase("presiden")||jenis.equalsIgnoreCase("perdana menteri")) {
            tgl = scn.nextInt();//untuk memasukan input variabel tersebut dengna tipe integer
            bulan = scn.nextInt();
            tahun = scn.nextInt();
        }
    }

    void tampilkan(){//method
        HashMap<Integer, String> month = new HashMap<Integer,String>();////class yang berisi sekumpulan pasangan value (nama bulan) dan key (hitungan bulan dalam angka). dengan month sebaga nama objek hasmaph nya
        month.put(1, "Januari");
        month.put(2, "Februari");
        month.put(3, "Maret");
        month.put(4, "April");
        month.put(5, "Mei");
        month.put(6, "Juni");
        month.put(7, "Juli");
        month.put(8, "Agustus");
        month.put(9, "September");
        month.put(10, "Oktober");
        month.put(11, "November");
        month.put(12, "Desember");
        if (jenis.equalsIgnoreCase("presiden")||jenis.equalsIgnoreCase("perdana menteri")) {
        System.out.println("Negara "+nama+" mempunyai "+jenis+" bernama "+pemimpin);}//// statement if hasil perbandingan equalsIgnoreCase dan menampilkan hasil
        else if (jenis.equalsIgnoreCase("monarki")){
            System.out.println("Negara "+nama+" mempunyai Raja"+" bernama "+pemimpin+"\n");//// namun jika tidak dari keduanya yaitu monarki maka tampilkan
        }
        if (jenis.equalsIgnoreCase("presiden")||jenis.equalsIgnoreCase("perdana menteri")) {
        System.out.println("Deklarasi Kemerdekaan pada Tanggal "+tgl+" "+month.get(getBulan())+" "+tahun+"\n");}/// statemn if lagi hasil perbanfinga presiden || perdana mentri untuk menampilkan tanggal kemerdekaan sehingga negara dengan jenis kepemimpinan tidak
    }
}     
