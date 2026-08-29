/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author lenovo
 */
public class rabbit {
  String nama, warna;
int umur, nomorAbsen;

void lari(){
    System.out.println(nama+" Berlari kencang");
}

void makan(){
    System.out.println(nama+" Makan Wortel"); 
}

void minum(){
    System.out.println(nama+" Minum Air");
}
    public static void main(String[] args) {
        //Membuat Objek
        rabbit sento = new rabbit();
        
        //Input Atribut
        sento.nama = "Sento";
        sento.warna = "Merah";
        sento.umur = 2;
        sento.nomorAbsen = 1;
        
        //Output Atribut
        System.out.println("Nama : "+sento.nama);
        System.out.println("Warna : "+sento.warna);
        System.out.println("Umur : "+sento.umur);
        System.out.println("Nomor Absen : "+sento.nomorAbsen);
        
        //Memanggil Method
        sento.lari();
        sento.makan();
        sento.minum();
    }
}
