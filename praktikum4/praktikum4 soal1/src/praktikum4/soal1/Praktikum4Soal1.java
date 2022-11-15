/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4.soal1;
import java.util.Scanner;

public class Praktikum4Soal1 {
  
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Judul :");
        String judul = input.nextLine();
        System.out.print("Penulis :");
        String penulis = input.nextLine();
        System.out.print("Tahun terbit :");
        int tahun = input.nextInt();
        buku Buku = new buku (judul, penulis, tahun);
        Buku.display();
        
    }
    
}
