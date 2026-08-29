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
public class kategoriTransaksiKasir {
    public static void main(String[] args) {
         //Membuat Objek Scanner
   Scanner in = new Scanner(System.in);
   //Deklarasi variabel yang akan di switch kan
   int kategori = 0;
        System.out.println("Sistem Kategori Aplikasi Kasir");
        System.out.println("1. Pembelian Barang");
        System.out.println("2. Penjualan Barang");
        System.out.println("3. Retur Barang");
        System.out.println("4. Pembayaran Supplier");
   //Input kategori
        System.out.println("");
        System.out.print("Pilih Kategori : ");
        System.out.println("");
   kategori = in.nextInt();
   //Proses untuk memunculkan Output Switch Case
   //Switch berdasarkan kategori
   switch(kategori){
       //Beberapa Case kategori yang akan dicocokkan
       case 1 : 
           System.out.println("Jenis Transaksi : Pembelian Barang");
           System.out.println("Proses : Mencatat barang yang dibeli");
           break;
       case 2 : 
           System.out.println("Jenis Transaksi : Penjualan Barang");
           System.out.println("Proses : Mencatat barang yang terjual");
           break;
       case 3 :
           System.out.println("Jenis Transaksi : Retur Barang");
           System.out.println("Proses : Mencatat barang yang diretur");
           break;
       case 4 :
           System.out.println("Pembayaran Supplier");
           System.out.println("Proses : Mencatatat Pembayaran Supplier");
           break;
       default :
           System.out.println("Jenis Transaksi tidak tersedia");
    } 
}
}
