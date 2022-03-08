/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun3D;

import bangun2D.Lingkaran;

/**
 *
 * @author WXO
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    
    double tinggi;
    double luas,volume;

    public Tabung(double tinggi, double jari) {
        super(jari);
        this.tinggi = tinggi;
    }

    @Override
    public void LuasPermukaan() {
        luas = 2*getLuas()+(2*PHI*jari*tinggi);
        System.out.println("Luas permukaan balok= " + luas);
    }

    @Override
    public void Volume() {
        volume = getLuas()*tinggi;
        System.out.println("Volume balok= " + volume);
    }
    
}
