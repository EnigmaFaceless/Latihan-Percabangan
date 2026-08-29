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
public class perhitunganBMR {
    public static void main(String[] args) {
     //Deklarasi
     double bb, tb, umur, bmr =0;
     String jenisKelamin;
     //Membuat Objek Scanner
     Scanner in = new Scanner(System.in);
     //Input
        System.out.print("Masukkan Jenis Kelamin anda (L/P) : ");
        jenisKelamin = in.nextLine();
        
            System.out.print("Masukkan Berat Badan anda (Kg): ");
        bb = in.nextDouble();
        
            System.out.print("Masukkan Tinggi Badan anda (M): ");
        tb = in.nextDouble();
        
            System.out.print("Masukkan Umur anda : ");
        umur = in.nextDouble();
        System.out.println("");
        //Proses Menghitung BMR
        if (jenisKelamin.equalsIgnoreCase("L")) {
        bmr = 10 * bb + 6.25 * (tb * 100) - 5 * umur + 5;
        } else if (jenisKelamin.equalsIgnoreCase("P")) {
        bmr = 10 * bb + 6.25 * (tb * 100) - 5 * umur - 161;
        }
        //Output
        System.out.println("Jenis Kelamin : "+jenisKelamin);
        System.out.println("Berat Badan : "+bb+" Kg");
        System.out.println("Tinggi Badan : "+tb+" M");
        System.out.println("Umur : "+umur+" Tahun");
        System.out.println("BMR anda adalah : "+bmr);
          //Proses Menentukan Kategori Kalori
        if(bmr <1500){
            System.out.println("Kategori Kalori anda adalah Rendah.");
        }else if(bmr >=1500 && bmr <=1999){
            System.out.println("Kategori Kalori anda adalah Normal.");  
        }else if(bmr >=2000){
            System.out.println("Kategori Kalori anda adalah Tinggi.");
            }
        else{
            bmr = 0;
        }
        }
    }   
        

