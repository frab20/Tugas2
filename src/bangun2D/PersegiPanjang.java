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
public class PersegiPanjang implements MenghitungBidang{
    
    public final double panjang,lebar;
    private double keliling,luas;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void Keliling() {
        keliling = (panjang + lebar)*2;
        System.out.println("Keliling persegi panjang= " + keliling);
    }

    @Override
    public void Luas() {
        luas = panjang*lebar;
        System.out.println("Luas persegi panjang= " + luas);
    }

    public double getLuas() {
        return luas;
    }
     
    
}
