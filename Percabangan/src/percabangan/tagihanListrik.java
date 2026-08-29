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
public class tagihanListrik {
    public static void main(String[] args) {
      //Deklarasi
      double pemakaianListrik, tarif, totalAwal, diskon = 0, totalAkhir, jumlahDiskon;
      //Membuat Objek Scanner
      Scanner in = new Scanner(System.in);
      //input
        System.out.print("Masukkan Jumlah Pemakaian Listrik (kWh) : ");
      pemakaianListrik = in.nextDouble();
      
      //proses menentukan tarif
      if(pemakaianListrik >=1 && pemakaianListrik<=100){
          tarif = 1500;
      }else if(pemakaianListrik>=101 && pemakaianListrik<=250){
          tarif = 2000;
      }else if(pemakaianListrik>=251 && pemakaianListrik<=500){
          tarif = 2500;
      }else{
          tarif = 3000;
      }
      //proses menghitung total tagihan sebelum diskon
   totalAwal = pemakaianListrik*tarif;
    //Proses Menentukan Apakah Pelanggan Mendapatkan Diskon
    if(totalAwal>500000){
      diskon = 0.05;
    }else{
     diskon = 0;
    }
    //Proses Menghitung Jumlah Diskon
    jumlahDiskon = totalAwal*diskon;
    //Proses Menghitung Total Bayar
    totalAkhir = totalAwal - (totalAwal*diskon);
    //Output
        System.out.println("Jumlah Pemakaian Listrik per kWh anda adalah : "+pemakaianListrik+" kWh");
        System.out.println("Jumlah Tarif per kWh adalah : "+"Rp."+tarif);
        System.out.println("Jumlah Total Tagihan anda adalah : "+"Rp."+totalAwal);
        System.out.println("Jumlah Diskon anda adalah : "+"Rp."+jumlahDiskon);
        System.out.println("Jumlah Total Bayar anda adalah : "+"Rp."+totalAkhir);
    }
}
