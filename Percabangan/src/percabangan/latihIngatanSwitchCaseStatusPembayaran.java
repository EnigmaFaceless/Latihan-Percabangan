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
public class latihIngatanSwitchCaseStatusPembayaran {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int status;
        
        System.out.println("=== Status Pembayaran ===");
        System.out.println("1. Belum dibayar");
        System.out.println("2. Sudah dibayar");
        System.out.println("3. gagal");
        System.out.println("4. dibatalkan");
        System.out.println("");
        System.out.print("Pilih Status : ");
        status = in.nextInt();
        
        switch(status){
            case 1 :
                System.out.println("Status Pembayaran: Belum dibayar");
                break;
            case 2 :
                System.out.println("Status Pembayaran: Sudah dibayar");
                break;
            case 3 : 
                System.out.println("Status Pembayaran: Gagal");
                break;
            case 4 : 
                System.out.println("Status Pembayaran: dibatalkan");
                break;
            default :
                System.out.println("Status tidak dikenal");
        }
    }
  
}
