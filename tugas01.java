/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanjava02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author I Gusti AGung Raditiya Gotama
 * 2201010243
 * 2024-03-25
 * 
 * 
 */
public class tugas01 {
    
   public static void main(String[] args) {
    BufferedReader dtin = new BufferedReader (new BufferedReader(new InputStreamReader(System.in)) );
        Double n, luas;
        int a = 0;
        int t = 0;
        String alas ="";
        String tinggi ="";
        n = 0.5;
        
        System.out.println("Hitung Luas Segitiga ");
        System.out.print("Input Nilai Alas ");
        try{
            alas = dtin.readLine();
            System.out.print("Input Nilai Tinggi "); 
            tinggi = dtin.readLine();
        }catch(IOException e){
            System.out.println("terjadi kesalahan pada input data");
        }
        a = Integer.parseInt(alas);
        t = Integer.parseInt(tinggi);
        luas = n * a * t;
        
        System.out.println("luas segitiga:"+luas);
    }
}

