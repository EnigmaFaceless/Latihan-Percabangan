/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author lenovo
 */
public class kelilingPersegiPanjang {
    private int panjang, lebar;
    private double keliling;
    
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    public int getPanjang(){
        return panjang;
    }
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    
    public int getLebar(){
        return lebar;
    }
    
    public void setKeliling(int panjang, int lebar){
    keliling = 2*(panjang+lebar);
}
    public double getKeliling(){
        return keliling;
    }
}
