/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabangan;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class Percabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Deklarasi
        int totalPembayaran, jumlahPembelian, hargaBarang;
       
       //Membuat Objek Scanner
       Scanner in = new Scanner(System.in);
       
       //input
        System.out.print("Masukkan Jumlah Pembelian : ");
        jumlahPembelian = in.nextInt();
        
                //proses Menentukan harga barang
       if (jumlahPembelian >= 1 && jumlahPembelian <=5){
           hargaBarang = 95000;
        }else if (jumlahPembelian >=6 && jumlahPembelian <=12){
        hargaBarang = 92000;
    }else if (jumlahPembelian >=13 && jumlahPembelian <=20){
       hargaBarang = 89000; 
    }else if (jumlahPembelian >=21 && jumlahPembelian <=40){
        hargaBarang = 84000;
    }else if (jumlahPembelian >=41 && jumlahPembelian <=99){
      hargaBarang = 81000;  
    }else if (jumlahPembelian >= 100){
        hargaBarang = 78000; 
    }else{
        hargaBarang = 0;
    }
        //proses mennetukan total Pembayaran
        totalPembayaran = jumlahPembelian * hargaBarang;
        
        //output
        System.out.println("Harga Per Unit : "+"Rp."+hargaBarang);
        System.out.println("Total Pembayaran adalah "+"Rp."+totalPembayaran);
    }  
}
