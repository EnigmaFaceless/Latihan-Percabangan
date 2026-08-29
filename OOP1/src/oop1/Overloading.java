/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author lenovo
 */
public class Overloading {
    static void tampil(){
        System.out.println("Boboiboy Kuasa 3");
    }
    static void tampil(int a){
        System.out.println("Keris Petir Damage : "+a);
    }
    static void tampil(int a, int b){
        System.out.println("Bola Api Damage : "+a+" || Golem Naga Tanah : "+b);
    }
    static void tampil(String str){
        System.out.println("peran : "+str);
    }
    public static void main(String[] args) {
        tampil();
        tampil(100);
        tampil(100, 1000);
        tampil("Penyelamat Bumi");
    }
}
