/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author lenovo
 */
public class methodX {
    static int cetak(int sisi){//Deklarasi dan parameter
    return sisi*sisi; //proses
    }
    
    static int coba(int bil){
        return bil*bil;
    }
    public static void main(String[] args) {
        int x = 5; //input
        System.out.println("Luas Persegi = "+cetak(5)); //output
        
        x = 3;
        System.out.println(x+" Kuadrat "+coba(3));
    }
}
