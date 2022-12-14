/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5.soal1;

public class Cylinder extends Shape{
 private double radius;
 private double height;
 public Cylinder(double r, double h) {
 super("Cylinder"); 
 radius = r;
 height = h;
 } 
 public double area(){
 return Math.PI*radius*radius*height;
 }
 public String toString() {
 return super.toString() + " (radius) " + radius + " and (height) " + 
height;
 }
}
