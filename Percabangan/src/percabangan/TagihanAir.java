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
public class TagihanAir {
    public static void main(String[] args) {
      //deklarasi 
     double  pemakaianAir, tarif, totalSebelumDiskon, diskon, totalBayar,jumlahDiskon;
     
     //Membuat Objek Scanner
     Scanner in = new Scanner(System.in);
     
     //Input
        System.out.print("Masukkan Pemakaian Air(m3) : ");
        pemakaianAir = in.nextDouble();
     //Proses Menentukan tarif
     if(pemakaianAir >=1 && pemakaianAir <=20){
         tarif = 4000;
     }else if(pemakaianAir >=21 && pemakaianAir <=35){
         tarif = 5500;
     }else if (pemakaianAir >=36 && pemakaianAir <=50){
         tarif = 7000;
     }else if(pemakaianAir>50){
         tarif = 9000;
     }else{
         tarif = 0;
     }
     //Menghitung Total Sebelum Diskon
     totalSebelumDiskon = tarif * pemakaianAir;
     //Proses Menentukan Apakah Pelanggan Mendapatkan Diskon
     if(totalSebelumDiskon >300000){
         diskon = 0.1;
     }else{
         diskon = 0;
     }
     //Menghitung Total Diskon
     jumlahDiskon = totalSebelumDiskon * diskon;
     //Menghitung Total Bayar
     totalBayar = totalSebelumDiskon - jumlahDiskon;
     //Output
        System.out.println("Total Pemakaian Air anda adalah : "+pemakaianAir+" m3");
         System.out.println("Total tarif anda adalah : "+" Rp."+tarif);
          System.out.println("Total Tagihan anda adalah : "+" Rp"+totalSebelumDiskon);
          System.out.println("Total Diskon anda adalah : "+" Rp"+jumlahDiskon);
          System.out.println("Total Bayar anda adalah : "+" Rp"+totalBayar);
         
    }  
}
