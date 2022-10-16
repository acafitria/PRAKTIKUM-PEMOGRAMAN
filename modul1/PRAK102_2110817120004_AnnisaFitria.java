/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;
import java.util.Scanner;

public class PRAK102_2110817120004_AnnisaFitria {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       //deklarasi
       int x = 0;
       int input = keyboard.nextInt();
       
       //masuk rumus
       while(x<= 6 )
       { int y;
       if (input % 2 == 0) {
           y=(input /2)-1;
           System.out.print(""+y+"");}
       else { System.out.print(input);
       } input ++;
       x++;
    }
    keyboard.close();
}
    
}
