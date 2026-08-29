/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class belanjaToko {
    public static void main(String[] args) {
      //Deklarasi
      double jumlahBarang, harga = 0, totalBelanja, diskon, jumlahDiskon, totalBayar;
      //Membuat Objek Scanner
      Scanner in = new Scanner(System.in);
      //Input
        System.out.print("Masukkan Jumlah Barang : ");
        jumlahBarang = in.nextDouble();
        //Menentukan Harga 
        if(jumlahBarang>=1 && jumlahBarang<=10){
            harga = 25000;
        }else if(jumlahBarang>=11 && jumlahBarang<=20){
            harga = 23000;
        }else if(jumlahBarang>=21 && jumlahBarang<=40){
            harga = 21000;
        }else if(jumlahBarang>40){
            harga = 19000;
        }
        //Proses Menetukan Total Belanja
           totalBelanja = jumlahBarang * harga;
        //Proses Menentukan Apakah Pelanggan Mendapatkan Diskon
        if(totalBelanja>750000){
            diskon = 0.08;
        }else{
            diskon = 0;
        }
        //Menghitung Jumlah Diskon
        jumlahDiskon = totalBelanja * diskon;
        //Menghitung Total Bayar
        totalBayar = totalBelanja - jumlahDiskon;
        
        //Output
        System.out.println("Jumlah Barang : "+jumlahBarang);
        System.out.println("Harga Per Unit : "+"Rp."+harga);
        System.out.println("Total Belanja (Total sebelum diskon) : "+"Rp."+totalBelanja);
        System.out.println("Jumlah Diskon : "+"Rp."+jumlahDiskon);
        System.out.println("Total Bayar (Total Setelah Diskon) : "+"Rp."+totalBayar);
    }
}
