/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan.arrayBukanPercabangan;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class array3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int [] array; //Deklarasi
    array = new int [10]; //Penentuan Slot banyak Tempat
    
    for(int x=0; x<9; x++){
        System.out.print("Jumlah Isi Array : ");
        array[x] = in.nextInt();
        
        for (int y = 0; y<9; y++ ){
            System.out.println(array[y]);
    }
    }
    }
}
