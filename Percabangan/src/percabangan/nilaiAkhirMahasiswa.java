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
public class nilaiAkhirMahasiswa {
    public static void main(String[] args) {
         //Declare
    int nilaiTugas, uts, uas;
    double nilaiAkhir;
    
    //Membuat Objek Scanner
    Scanner in = new Scanner(System.in);
    
    //input 
        System.out.print("Masukkan Nilai Tugas Mahasiswa : ");
        nilaiAkhir = in.nextInt();
        System.out.print("Masukkan Nilai UTS Mahasiswa : ");
        uts = in.nextInt();
        System.out.print("Masukkan Nilai UAS Mahasiswa : ");
        uas = in.nextInt();
        
        //Proses Menghitung Nilai Akhir 
        nilaiAkhir = (0.2 * nilaiAkhir) + (0.3*uts)+ (0.5*uas);
        
        //Proses Menentukan Predikat
        if(nilaiAkhir >=85){
            System.out.println("Predikat adalah A");
        }else if(nilaiAkhir>=70 && nilaiAkhir<=84.99){
            System.out.println("Predikat adalah B");  
        }else if(nilaiAkhir>=55 && nilaiAkhir<=69.99){
            System.out.println("Predikat adalah C");   
        }else{
            System.out.println("Predikat adalah D");  
        }
        //Output
        System.out.println("Nilai Akhir Mahasiswa adalah : "+nilaiAkhir);
    }
}
