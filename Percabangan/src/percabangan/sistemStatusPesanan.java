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
public class sistemStatusPesanan {
    public static void main(String[] args) {
        //Membuat Objek Scanner
        Scanner in = new Scanner(System.in);
        //Deklarasi variabel Switch
        int status = 0;
        //Tampilan Menu
        System.out.println("Sistem Status Pesanan");
        System.out.println("");
        System.out.println("1. Menunggu Pembayaran");
        System.out.println("2. Diproses");
        System.out.println("3. Dikirim");
        System.out.println("4. Selesai");
        System.out.println("5. Dibatalkan");
        //input status
        System.out.println("");
        System.out.print("Pilih nomor status : ");//jangan lupa kasih komentar pada input
        System.out.println("");
        status = in.nextInt();
        //Proses Switch
        switch(status){
            case 1 : //Ingat Case dan angka dikasih spasi
                System.out.println("Pesanan Menunggu Pembayaran");
                break; // jangan lupa dikasih break biar bisa langsung keluar dari switch case
            case 2 : //Setelah Case dikasih spasi sebelum dikasih angka
                System.out.println("Pesanan sedang diproses");
                break; //jangan lupa tambahkan break
            case 3 :
                System.out.println("Pesanan sedang dikirim");
                break; //jangan lupa tambahkan break
            case 4 :
                System.out.println("Pesanan selesai");
                break; //jangan lupa tambahkan break
            case 5 :
                System.out.println("Pesanan selesai");
                break; //jangan lupa tambahkan break
            default :
                System.out.println("Status tidak dikenal");
        }
    }
}
