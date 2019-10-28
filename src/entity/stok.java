/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author haticeozbakir
 */
public class stok {
    private int stokid;
    private String stokadi;
    private String birim;
    private String birimfiyat;
    private int miktar;

    public int getStokid() {
        return stokid;
    }

    public void setStokid(int stokid) {
        this.stokid = stokid;
    }

    public String getStokadi() {
        return stokadi;
    }

    public void setStokadi(String stokadi) {
        this.stokadi = stokadi;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getBirimfiyat() {
        return birimfiyat;
    }

    public void setBirimfiyat(String birimfiyat) {
        this.birimfiyat = birimfiyat;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    @Override
    public String toString() {
        return "stok{" + "stokid=" + stokid + ", stokadi=" + stokadi + ", birim=" + birim + ", birimfiyat=" + birimfiyat + ", miktar=" + miktar + '}';
    }

    public stok(int stokid, String stokadi, String birim, String birimfiyat, int miktar) {
        this.stokid = stokid;
        this.stokadi = stokadi;
        this.birim = birim;
        this.birimfiyat = birimfiyat;
        this.miktar = miktar;
    }

    public stok() {
    }
    
}
