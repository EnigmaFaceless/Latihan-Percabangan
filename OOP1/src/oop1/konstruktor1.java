/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author lenovo
 */
public class konstruktor1 {
    String nama;
    int attack;
    int defense;

    public konstruktor1(String nama, int attack, int defense) {
    this.nama = nama;
    this.attack = attack;
    this.defense = defense;
    }
    public static void main(String[] args) {
        konstruktor1 ninja = new konstruktor1("Eka", 1000, 100000);
        
        ninja.attack = 100;
        ninja.defense = 1000;
        ninja.nama = "Ryu";
        
        System.out.println("Attack : "+ninja.attack);
        System.out.println("Defense : "+ninja.defense);
        System.out.println("Nama : "+ninja.nama);
        System.out.println("Kode ini belum selesai, nanti akan dilanjutkan");

    }
}


