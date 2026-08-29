/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author lenovo
 */
public class bangunDatar2 {
    static int luasPersegiPanjang(int panjang, int lebar){//Deklarasi Panjang dan Lebar
      int luas = panjang*lebar; //deklarasi luas dan rumus luas
      return luas; //return luas, mengembalikan nilai luas
    }
    public static void main(String[] args) {
        int x1 = 10; //parameter input pengganti deklarasi panjang
        int x2 = 4; //parameter input pengganti deklarasi lebar
        
        System.out.println("Luas Persegi Panjang : "+luasPersegiPanjang(+x1, x2)); 
     //Menampilkan Hasil Perhitungan Luas Persegi Panjang dengan memanggil method 
     //luasPersegiPanjang dengan mengisi parameter pada kurungan method
    }
}
