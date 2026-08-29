/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author lenovo
 */
public class methodAllBentuk {
    static void bentuk1(){
        System.out.println("Method Bentuk 1 : ");
        System.out.print("I Love You,");
    }
    
    static void bentuk2(int a){ //Deklarasi dan input untuk proses
        System.out.println("Umur : "+a); //proses text sederhana dan a?? untuk menampilkan kali..... gatau ah.
    }
    
    static int bentuk4(int sisi){ //Deklarasi dan input untuk proses
     return sisi*sisi; //proses nya bersamaan dengan langsung return. jadi nanti mengembalikan nilai return 
     //sembari memproses perhtiungan sisi*sisi???
    }
    
    static int bentuk5(int panjang, int lebar){
        return 2 * (panjang + lebar);
    }
    
    static int bentuk3(){
        return 10;
    }
    
    public static void main(String[] args) {
        bentuk1();
        System.out.println("in every universe.");
        System.out.println("-Dr. Strange-");
        System.out.println("");
        int a = 21;
        bentuk2(a);
        
        int y = 8;
        System.out.println(y+" Kuadrat "+bentuk4(y));
      
        int x1=10;
        int x2=20;
        System.out.println("2 x "+"("+x1+"+"+x2+")"+"="+bentuk5(x1,x2));
       
        
        System.out.println("Nomor Punggung Messi : "+bentuk3());
    }

}
