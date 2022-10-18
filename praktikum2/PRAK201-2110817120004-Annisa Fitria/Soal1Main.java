/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

public class Soal1Main {

    public static void main(String[] args) {
        mangga Arumanis = new mangga("Arumanis",0.3f, 13, 3.9f, 65000);
        
        mangga Manalagi = new mangga ("Manalagi", 0.5f,17,8.5f, 127500);
        
        mangga Madu = new mangga("Madu", 0.375f ,12, 4.5f, 78000);
       
//panggil method yang disebelah
        Arumanis.tampilkan();
        Manalagi.tampilkan();
        Madu.tampilkan();
    }
        
    }
    
