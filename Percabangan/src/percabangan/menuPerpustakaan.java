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
public class menuPerpustakaan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int menu = 0;
        System.out.println("=== Menu Perpustakaan ===");
        System.out.println("1. Tambah Buku");
        System.out.println("2. Cari Buku");
        System.out.println("3. Pinjam Buku");
        System.out.println("4. Kembalikan Buku");
        System.out.println("5. Keluar");
        System.out.println("");
        System.out.print("Pilih menu : ");
        menu = in.nextInt();
        
        switch(menu){
            case 1 :
            System.out.println("Membuka menu tambah buku");
            break;
            case 2 :
                System.out.println("Membuka menu pencarian buku");
                break;
            case 3 :
              System.out.println("Memproses peminjaman buku");
              break;
            case 4 :
                System.out.println("Memproses pengembalian buku");
                break;
            case 5 :
                System.out.println("Program perpustakaan selesai.");
                System.out.println("Terima kasih telah menggunakan aplikasi.");
                break;
            default :
                System.out.println("Menu tidak tersedia");
    }
}
}
