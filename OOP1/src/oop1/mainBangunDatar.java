/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author lenovo
 */
public class mainBangunDatar {
    public static void main(String[] args) {
          bangunDatar bd = new bangunDatar();
          bd.setAlas(5);
          bd.setTinggi(7);
          System.out.println("Alas Segitiga : "+bd.getAlas());
          System.out.println("Tinggi Segitiga : "+bd.getTinggi());
          bd.setluasSegitiga(bd.getAlas(), bd.getTinggi());
          System.out.println("Luas Segitiga : "+bd.getLuasSegitiga());
    }
  
}
