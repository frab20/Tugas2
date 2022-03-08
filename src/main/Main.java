/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bangun3D.Balok;
import bangun3D.Tabung;
import java.util.Scanner;

/**
 *
 * @author WXO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pil = 1;
        
        // TODO code application logic here
        
        Scanner key = new Scanner(System.in);
        
        System.out.println("+--------------+");
        System.out.println("|  Menu Utama  |");
        System.out.println("+--------------+");
        
        while(pil != 0){
            
            
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih\t: ");
            pil = key.nextInt();
            
            switch(pil){
                case 1 :{double p,l,t; 
                        System.out.print("Input panjang: "); p = key.nextDouble();
                        System.out.print("Input lebar: "); l = key.nextDouble();
                        System.out.print("Input tinggi: "); t = key.nextDouble();
                        Balok balok1 = new Balok(p, l, t);
                        balok1.Luas();
                        balok1.Keliling();
                        balok1.Volume();
                        balok1.LuasPermukaan();
                        }
                        break;
                case 2 :{double r,t; 
                        System.out.print("Input jari-jari: "); r = key.nextDouble();
                        System.out.print("Input tinggi: "); t = key.nextDouble();
                        Tabung tabung1 = new Tabung(r,t);
                        tabung1.Luas();
                        tabung1.Keliling();
                        tabung1.Volume();
                        tabung1.LuasPermukaan();
                        }
                        break;
                default: System.out.println("Opsi tidak ada, Mohon masukan opsi dengan benar!");
            }
        
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
            pil = key.nextInt();
        } 
    }
    
}
