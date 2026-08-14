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
public class bmiCalculator {
    public static void main(String[] args) {
       //Deklarasi
    double bb, tb, bmi;
    //Membuat Objek Scanner
    Scanner in = new Scanner(System.in);
    //Input
        System.out.print("Masukkan Berat Badan Anda(Kg) : ");
        bb = in.nextDouble();
        System.out.print("Masukkan Tinggi Badan Anda(M) : ");
        tb = in.nextDouble();
        //Menghitung nilai BMI
        bmi = bb/(tb*tb);
        //Mennetukan Status BMI
        if (bmi <18.5){
            System.out.println("Status BMI anda adalah Kurus");
        }else if (bmi >=18.5 && bmi <25){
            System.out.println("Status BMI anda adalah Normal");
        }else if(bmi >=25 && bmi <30){
            System.out.println("Status BMI anda adalah Kelebihan Berat Badan");
        }else{
        System.out.println("Status BMI anda adalah Obesitas"); 
        }
        //Output
        System.out.println("Nilai BMI anda adalah : "+bmi);
}   
    }
