/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop1;

/**
 *
 * @author lenovo
 */
class Ninja {

    // Atribut
    String nama;
    int attack;
    int defense;
    int power;

    // Method
    void lemparShuriken() {
        System.out.println(nama + " melempar shuriken!");
    }

    void lariCepat() {
        System.out.println(nama + " berlari dengan cepat!");
    }

    void serang() {
        System.out.println(nama + " menyerang musuh!");
    }
}

public class Main {

    public static void main(String[] args) {

        // Membuat object
        Ninja Eka = new Ninja();

        // Mengisi atribut
        Eka.nama = "Eka";
        Eka.attack = 998;
        Eka.defense = 2000;
        Eka.power = 100;

        // Menampilkan atribut
        System.out.println("Nama    : " + Eka.nama);
        System.out.println("Attack  : " + Eka.attack);
        System.out.println("Defense : " + Eka.defense);
        System.out.println("Power   : " + Eka.power);

        // Memanggil method
        Eka.lemparShuriken();
        Eka.lariCepat();
        Eka.serang();
    }
}
