/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author lenovo
 */
public class bangunDatar {
   private int alas;
   private int tinggi;
   private double luas;
  
   public void setAlas(int alas){
    this.alas = alas;
}
   public int getAlas(){
       return alas;
}
   public void setTinggi(int tinggi){
       this.tinggi = tinggi;
   }
   public int getTinggi(){
       return tinggi;
   }
   public void setluasSegitiga(int alas, int tinggi){
       luas = 0.5 * alas * tinggi;
   }
   public double getLuasSegitiga(){
       return luas;
   }
    public static void main(String[] args) {
        
    }
}

