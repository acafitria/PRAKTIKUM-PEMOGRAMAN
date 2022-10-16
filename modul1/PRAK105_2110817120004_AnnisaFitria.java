/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;
import java.util.Scanner;

public class PRAK105_2110817120004_AnnisaFitria {
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       
        //phi, r:jari-jari, t: tinggi
        final float phi = 3.14f;
        float r, t, h;
        Scanner keyboard = new Scanner(System.in);
 
        // masukan input
        System.out.print("Masukan jari jari: ");
        r = input.nextFloat();
        System.out.print("Masukan tinggi: ");
        t = input.nextFloat();
 
        //masuk rumus
        h = (phi * r * r * t);
 
        System.out.printf("Volume tabung dengan jari- jari " +r+" cm dan tinggi "+t+" cm adalah "+ h);
    }
}
   
   
