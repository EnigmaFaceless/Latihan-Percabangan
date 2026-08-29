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
public class biayaFotoCopypart1 {
    public static void main(String[] args) {
       //Deklarasi
       String namaPelanggan, jenisKertas;
       int jumlahLembar, harga = 0, total;
       
       //Membuat Objek Scanner
       Scanner in = new Scanner(System.in);
       
       //Input
        System.out.print("Nama Pelanggan : ");
        namaPelanggan = in.nextLine();
        System.out.print("Jumlah Lembar : ");
        jumlahLembar = in.nextInt();
        in.nextLine(); // Membersihkan enter
        System.out.print("Jenis Kertas : ");
        jenisKertas = in.nextLine();
     
      
        //Pilihan Kertas
        
        if(jenisKertas.equalsIgnoreCase("A4")){
           harga = 150; 
        }else if(jenisKertas.equalsIgnoreCase("F4")){
            harga = 200;
        }else if(jenisKertas.equalsIgnoreCase("Legal")){
            harga = 250;
        }
        
          //Total Biaya
        total = jumlahLembar * harga;
        
        //Output
        System.out.println("Nama Pelanggan : "+namaPelanggan);
        System.out.println("Jenis Kertas : "+jenisKertas);
        System.out.println("Perhitungan Biaya : "+jumlahLembar+" lembar "+" x "+"Rp"+harga);
        System.out.println("Total Biaya : "+"Rp"+total);
    }
}
