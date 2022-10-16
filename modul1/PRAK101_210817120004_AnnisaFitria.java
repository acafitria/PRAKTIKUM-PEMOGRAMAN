/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;
import java.util.Scanner;

public class PRAK101_210817120004_AnnisaFitria {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
         
        //deklarasi variabel untuk inputan
        String nama,tempat;
        int tanggal, bulan,tahun;
        float berat,tinggi;
        String namabulan = null;
        
        // untuk memasukan inputan
          System.out.println("Masukkan nama lengkap :") ;
          nama = keyboard.nextLine();// string pake line
          
          System.out.println("Masukkan tempat lahir :") ;
          tempat = keyboard.nextLine();
          
          System.out.print("Masukkan tanggal lahir :") ;
          tanggal = keyboard.nextInt();
          
          System.out.print("Masukkan bulan lahir :") ;
          bulan = keyboard.nextInt(); //int=int
          
          // untuk hitungan bulan
          if(bulan == 1)namabulan = "Januari";
          else if (bulan == 2)namabulan = "Februari";
          else if (bulan == 3)namabulan = "Maret";
          else if (bulan == 4)namabulan = "April";
          else if (bulan == 5)namabulan = "Mei";
          else if (bulan == 6)namabulan = "Juni";
          else if (bulan == 7)namabulan = "Juli";
          else if (bulan == 8)namabulan = "Agustus";
          else if (bulan == 9)namabulan = "September";
          else if (bulan == 10)namabulan = "Oktober";
          else if (bulan == 11)namabulan = "November";
          else if (bulan == 12)namabulan = "Desember";
          
          System.out.println("Masukkan tahun lahir :") ;
          tahun = keyboard.nextInt(); // s
          
          System.out.println("Masukkan tinggi badan :") ;
          tinggi = keyboard.nextFloat();
          
          System.out.println("Masukkan berat badan :") ;
          berat = keyboard.nextFloat();// sesuai tipe data yang di deklarasikan float=float
          
          keyboard.close(); // untuk menutup inputan
          
          System.out.println("Data telah ditambahkan") ;
          System.out.println("Nama lengkap "+ nama + ", lahir di "+ tempat + " pada tanggal "+tanggal+ " " + bulan+ " " + tahun + 
                             " tinggi badan " +tinggi + " dan berat badan "+berat +" kilogram");
     
    }
    
}

    
