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
public class penentuanNilaiAkhirStatusKelulusan {
    public static void main(String[] args) {
      //Deklarasi
      int tugas, uts = 0, uas = 0;
      double nilaiAkhir;
      
      //Membuat Objek Scanner
      Scanner in = new Scanner(System.in);
     //input
        System.out.print("Masukkan Nilai Tugas Mahasiswa : ");
        tugas = in.nextInt();
         System.out.print("Masukkan Nilai UTS Mahasiswa : ");
        uts = in.nextInt();
         System.out.print("Masukkan Nilai UAS Mahasiswa : ");
        uas = in.nextInt();
        //Proses Menghitung Nilai Akhir
        nilaiAkhir = (tugas*(0.3))+(uts*(0.3))+(uas*(0.4));
        //Output
        System.out.println("Nilai Tugas Mahasiswa : "+tugas);
        System.out.println("Nilai UTS Mahasiswa : "+uts);
        System.out.println("Nilai UAS Mahasiswa : "+uas);
        System.out.println("Nilai Akhir Mahasiswa : "+nilaiAkhir);
        //Proses Menentukan Predikat
        if(nilaiAkhir>=85){
            System.out.println("Predikat : A");
        }else if (nilaiAkhir>=75 && nilaiAkhir<=84){
          System.out.println("Predikat : B");  
    }else if (nilaiAkhir>=65 && nilaiAkhir<=74){
          System.out.println("Predikat : C"); 
    }else if (nilaiAkhir>=50 && nilaiAkhir<=64){
          System.out.println("Predikat : D"); 
    }else{
          System.out.println("Predikat : E"); 
    }
          //Menentukan Status Kelulusan
        if(nilaiAkhir>=60){
           System.out.println("Status : Lulus"); 
        }else{
            System.out.println("Status : Tidak Lulus"); 
        }
}
}
