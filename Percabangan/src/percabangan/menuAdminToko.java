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
public class menuAdminToko {
    public static void main(String[] args) {
        //Membuat Objek Scanner
        Scanner in = new Scanner(System.in);
        //Deklarasi Variabel yang akan di switch kan
        int menu = 0;
        //Kode untuk menampilkan Menu Pilihan yang tersedia
        System.out.println("=== Menu Pilihan ===");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Edit Produk");
        System.out.println("3. Hapus Produk");
        System.out.println("4. Lihat Produk");
        System.out.println("5. Keluar");
        System.out.println("");
        System.out.print("Masukkan Menu yang ingin anda pilih : ");
        //Input
        menu = in.nextInt();
        //Switch nilai/kondisi atau apalah yang akan dicarikan pasangan yang sesuai dengan case-case lainnya
        switch(menu){
            //Case 1 sampai 5 yang akan dicocokkan / disesuaikan dengan switch yang ada (switch saat ini adalah Menu)
           case 1 :
               System.out.println("Membuka Form Tambah Produk"); //Output jika memilih menu tertentu,
               //Jika memilih menu 1 akan muncul Membuka Form Tambah Produk 9lanjutan komentar yang diatas tepat komentar yang ini)
               break;//Jangan lupa Break untuk menghentikan switch case dan keluar dari switch case
           case 2 :
               System.out.println("Membuka Form Edit Produk");
               break;
           case 3 :
               System.out.println("Membuka Form Hapus Produk");
               break;
           case 4 : 
               System.out.println("Membuka Form Lihat Produk");
               break;
           case 5 :
               System.out.println("Program Selesai.");
               System.out.println("Terimakasih sudah menggunakan aplikasi.");;
               break;
               //Untuk jika ada kondisi yang tidak sesuai dengan semua case yang sedang tersedia saat ini
           default : 
               System.out.println("Menu tidak tersedia");
       }
    }
}
