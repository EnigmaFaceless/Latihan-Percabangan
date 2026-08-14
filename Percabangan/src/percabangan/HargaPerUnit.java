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
public class HargaPerUnit {
    public static void main(String[] args) {
      //Deklarasi
      int qty;
      double hpu,total;
      
      // Membuat Objek SCanner
      Scanner in = new Scanner(System.in);
      //input
        System.out.print("Masukkan Jumlah Pembelian : ");
        qty = in.nextInt();
        
        // Proses Menentukkan Harga Per Unit
        if (qty >= 1 && qty <=5){
            hpu = 95000;
        }else if (qty >= 6 && qty <=12){
            hpu = 92000; 
        }else if(qty >= 13 && qty <=20){
            hpu = 89000; 
        }else if (qty >= 21 && qty <=40){
            hpu = 84000; 
        }else if (qty >= 41 && qty <=99){
            hpu = 81000; 
        }else if (qty >= 100){
            hpu = 78000; 
        }else{
            hpu = 0;
        }
        
        // Proses Menghitung Total Pembayaran
        total = qty * hpu;
        
        //Output
        
        System.out.println("Harga Per Unit barang yang dibeli : "+"Rp."+hpu);
        System.out.println("Total Pembayaran adalah : "+"Rp."+total);
    }
}
