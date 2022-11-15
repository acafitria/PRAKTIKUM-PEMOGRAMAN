/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4.soal2;
import java.util.Scanner;
public class Praktikum4Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih buku yang ingin diinputkan");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        System.out.println("Masukan pilihan : ");
        int pilihan = input.nextInt();
        input.nextLine();
        
        switch (pilihan) {
            case 1 ->                 {
                    String judul, penulis, tahun, genre, sinopsis;
                    System.out.print("Judul: ");
                    judul = input.nextLine();
                    System.out.print("Penulis: ");
                    penulis = input.nextLine();
                    System.out.print("Tahun Terbit: ");
                    tahun = input.nextLine();
                    System.out.print("Genre: ");
                    genre = input.nextLine();
                    System.out.print("Sinopsis: ");
                    sinopsis = input.nextLine();
                    
                    Novel nov = new Novel(judul, penulis, tahun, genre, sinopsis);
                    nov.display();
                    System.out.println(nov.getNovelDetail());
                }
            case 2 ->                 {
                    String judul, penulis, tahun, sinopsis;
                    int volume;
                    System.out.print("Judul: ");
                    judul = input.nextLine();
                    System.out.print("Penulis: ");
                    penulis = input.nextLine();
                    System.out.print("Tahun Terbit: ");
                    tahun = input.nextLine();
                    System.out.print("Volume: ");
                    volume = input.nextInt();
                    input.nextLine();
                    System.out.print("Sinopsis: ");
                    sinopsis = input.nextLine();
                    
                    Komik kom = new Komik(judul, penulis, tahun, volume, sinopsis);
                    System.out.println(kom.getKomikDetail());
                }
        }
    }
    
}
