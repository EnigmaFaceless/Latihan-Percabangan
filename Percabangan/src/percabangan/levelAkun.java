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
public class levelAkun {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
 
 int menu =0 ;
        System.out.println("=== Level Akun ====");
        System.out.println("1. Admin");
        System.out.println("2. Operator");
        System.out.println("3. Member");
        System.out.println("4. Tamu");
        System.out.println("5. Banned");
        System.out.println("");
        System.out.print("Pilih level : ");
 menu = in.nextInt();
 switch(menu){
     case 1 :
         System.out.println("Level : Admin");
         System.out.println("Akses : Semua fitur");
         break;
         
     case 2 : 
           System.out.println("Level : Operator");
         System.out.println("Akses : Mengelola data");
         break;
         
     case 3 : 
           System.out.println("Level : Member");
         System.out.println("Akses : Fitur member");
         break;
         
     case 4 :
           System.out.println("Level : Tamu");
         System.out.println("Akses : Melihat data");
         break;
         
     case 5 : 
           System.out.println("Level : Banned");
         System.out.println("Akses : Ditolak");
         break;
         
     default :
         System.out.println("Level tidak tersedia");
 }
    }
}
