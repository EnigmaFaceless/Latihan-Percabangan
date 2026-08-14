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
public class biayaPengiriman {
    public static void main(String[] args) {
     //Deklarasi
     int tarifPengiriman, beratPaket, totalBiayaPengiriman;
     //Membuat Objek Scanner
     Scanner in = new Scanner(System.in);
     //Input
        System.out.print("Masukkan Berat Paket(Kg) : ");
        beratPaket = in.nextInt();
        //Proses Menentukan Tarif Pengiriman
        if (beratPaket >=1 && beratPaket<=3){
        tarifPengiriman = 12000;
        }else if(beratPaket >=4 && beratPaket<=6){
          tarifPengiriman = 20000;  
        }else if((beratPaket >=7 && beratPaket<=10)){
            tarifPengiriman = 30000;
        }else if (beratPaket >=10){
            tarifPengiriman = 45000;
        }else{
            tarifPengiriman = 0;
        }
        //Proses Menghitung Total Biaya Pengiriman
        totalBiayaPengiriman = tarifPengiriman*beratPaket;
        //Output
        System.out.println("Berat Paket : "+beratPaket);
        System.out.println("Total Biaya Pengiriman anda adalah : "+totalBiayaPengiriman);
    }
}
