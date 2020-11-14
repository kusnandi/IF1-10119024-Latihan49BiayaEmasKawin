/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110119024lathian49biayaemaskawin;

/**
 *
 * @author acer
 * KUSNANDI PIRMANSYAH
 * IF-1
 * 10119024
 */
public class BiayaEmasKawin {
    private double emas, harga;
    private String nama;
    
    public BiayaEmasKawin(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public double getEmas() {
        return this.emas;
    }
    
    public void setEmas(double emas) {
        this.emas = emas;
    }
    
    public double getHarga() {
        return this.harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double totalBayar(double emas, double harga) {
        return emas * harga;
    }
    
}
