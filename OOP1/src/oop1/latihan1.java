/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author lenovo
 */
class Ninja{
    //  Make Atribute
    String nama;
    int attack;
    int power;
    int defense;
    
    // Make Method
    void lemparShuriken(){
        System.out.println(nama+" Melempar Shuriken!");
    }
    void serang(){
        System.out.println(nama + "Menyerang Musuh!");
    }
    void lariCepat(){
        System.out.println(nama + "Berlari dengan cepat!");
    }
    
}
public class latihan1 {
    public static void main(String[] args) {
        // Make Object
        Ninja Eka = new Ninja();
        
        // Input Atribute
        Eka.nama = "Eka";
        Eka.attack = 9999;
        Eka.defense = 10000000;
        Eka.power = 1000;
        
        // Show Atribute
        System.out.println("Nama    : " + Eka.nama);
        System.out.println("Attack  : " + Eka.attack);
        System.out.println("Defense : " + Eka.defense);
        System.out.println("Power   : " + Eka.power);
        
        // Call Method
        Eka.lemparShuriken();
        Eka.lariCepat();
        Eka.serang();
    }
}
