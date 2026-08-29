/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author lenovo
 */
public class mainKelilingPersegiPanjang {
    public static void main(String[] args) {
        kelilingPersegiPanjang kpp = new kelilingPersegiPanjang();
        
        kpp.setPanjang(9);
       kpp.setLebar(8);
        System.out.println("Panjang : "+kpp.getPanjang());
       System.out.println("Lebar : "+kpp.getLebar());
       kpp.setKeliling(9,8);
        System.out.println("Luas Persegi Panjang : "+kpp.getKeliling());
    }
}
