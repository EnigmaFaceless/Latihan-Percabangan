/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author lenovo
 */
public class mainPersegiPanjang {
    public static void main(String[] args) {
       persegiPanjang pp = new persegiPanjang();
       pp.setPanjang(7);
       pp.setlebar(10);
        System.out.println("Panjang : "+pp.getPanjang());
        System.out.println("Lebar : "+pp.getLebar());
        pp.setLuasPersegiPanjang(pp.getPanjang(), pp.getLebar());
        System.out.println("Luas Persegi Panjang : "+ pp.getLuasPersegiPanjang());
    }  
}
