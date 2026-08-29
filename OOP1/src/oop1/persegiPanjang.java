/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author lenovo
 */
public class persegiPanjang {
    //Atribut yang memiliki hak akses privat
   private int panjang, lebar;
   private double luas;
   //method untuk agar bisa diakses secara publik
   public void setPanjang(int panjang){
       this.panjang = panjang;
   }
   public int getPanjang(){
       return panjang;
}
   public void setlebar(int lebar){
       this.lebar = lebar;
   }
   public int getLebar(){
       return lebar;
   }
   public void setLuasPersegiPanjang(int panjang, int lebar){
       luas = panjang * lebar;
   }
   public double getLuasPersegiPanjang(){
       return luas;
   }
}
