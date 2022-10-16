/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

import java.util.Scanner;

public class PRAK103_2110817120004_AnnisaFitria {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int x = keyboard.nextInt();
        int y = 1;
        do{ if (x % 7 == 0){continue;}
        if (y == 5) System.out.print(x);
        else System.out.print(x +",");
        y++;
        x--;}
        while (y<=5);
    } 
    
}
