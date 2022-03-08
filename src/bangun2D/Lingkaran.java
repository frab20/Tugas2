/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun2D;

/**
 *
 * @author WXO
 */
public class Lingkaran implements MenghitungBidang{
    
    public final double jari;
    private double luas,keliling;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    public void Keliling() {
        keliling = PHI * jari *2;
        System.out.println("Keliling lingkaran= " + keliling);
    }

    @Override
    public void Luas() {
        luas = PHI * jari * jari;
        System.out.println("Luas lingkaran= " + luas);
    }

    public double getLuas() {
        return luas;
    }
    
    
}

