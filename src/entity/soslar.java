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
public class soslar extends urun{
    private int sosid;

    public int getSosid() {
        return sosid;
    }

    public void setSosid(int sosid) {
        this.sosid = sosid;
    }

    @Override
    public String toString() {
        return "soslar{" + "sosid=" + sosid + '}';
    }

    public soslar(int sosid, int urunid, String urunad, String urunfiyat, int stokid) {
        super(urunid, urunad, urunfiyat, stokid);
        this.sosid = sosid;
    }

    public soslar(int sosid) {
        this.sosid = sosid;
    }

    public soslar() {
    }
    
    
}
