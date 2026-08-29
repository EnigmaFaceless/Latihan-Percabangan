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
public class aplikasiHitungGajipart1 {
    public static void main(String[] args) {
       //Deklarasi
      String namaKaryawan, jabatan;
      int jumlahHariKerja, gaji = 0, totalGaji;
      
      //Membuat Objek Scanner
      Scanner in = new Scanner(System.in);
      
      //Input
      
        System.out.print("Nama Karyawan : ");
        namaKaryawan = in.nextLine();
        System.out.print("Jumlah Hari Kerja : ");
        jumlahHariKerja = in.nextInt();
        in.nextLine(); //Membersihkan Enter
         System.out.print("Jabatan : ");
        jabatan = in.nextLine();
        
        
        //Proses Menenentukan Gaji berdasarkan Jabatan
        if(jabatan.equalsIgnoreCase("Manager")){
            gaji = 250000;
        }else if(jabatan.equalsIgnoreCase("Supervisor")){
           gaji = 175000; 
        }else if(jabatan.equalsIgnoreCase("Staff")){
           gaji = 100000;
        }
        //Proses Menghitung Gaji
        totalGaji = gaji * jumlahHariKerja;
        //Output
        System.out.println("Nama Karyawan : "+namaKaryawan);
        System.out.println("Jabatan : "+jabatan);
        System.out.println("Perhitungan Gaji : "+jumlahHariKerja+" hari"+" x "+" Rp"+gaji);
        System.out.println("Total Gaji : "+"Rp"+totalGaji);
    }
}
