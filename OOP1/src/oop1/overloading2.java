/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author lenovo
 */
public class overloading2 {
    void build(){
        System.out.println("Kamen Rider Build Rabbit Tank Sparkling");
    }
    
    void build(int a){
        System.out.println("Kamen Rider Build Rabbit Tank Hazard Rating Keganasan : "+a);
    }
    
    void build(String b, String c){
        System.out.println(b+c);
    }
    void build(int x, int y){
        System.out.println("Kamen Rider Build Rabbit Rabbit nilainya : "+x+" & Kamen Rider Build Tank Tank nilainya : "+y);
    }
    public static void main(String[] args) {
      overloading2 ov = new overloading2();
      
      ov.build();
      ov.build(10000000);
      ov.build("Kamen Rider Build ", "Keren");
      ov.build(100, 1000);
    }
}
