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
public class urun {
    private int urunid;
    private String urunad;
    private String urunfiyat;
    private int stokid;

    public int getUrunid() {
        return urunid;
    }

    public void setUrunid(int urunid) {
        this.urunid = urunid;
    }

    public String getUrunad() {
        return urunad;
    }

    public void setUrunad(String urunad) {
        this.urunad = urunad;
    }

    public String getUrunfiyat() {
        return urunfiyat;
    }

    public void setUrunfiyat(String urunfiyat) {
        this.urunfiyat = urunfiyat;
    }

    public int getStokid() {
        return stokid;
    }

    public void setStokid(int stokid) {
        this.stokid = stokid;
    }

    @Override
    public String toString() {
        return "urun{" + "urunid=" + urunid + ", urunad=" + urunad + ", urunfiyat=" + urunfiyat + ", stokid=" + stokid + '}';
    }

    public urun(int urunid, String urunad, String urunfiyat, int stokid) {
        this.urunid = urunid;
        this.urunad = urunad;
        this.urunfiyat = urunfiyat;
        this.stokid = stokid;
    }

    public urun() {
    }
    
}
