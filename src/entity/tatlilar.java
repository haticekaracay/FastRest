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
public class tatlilar extends urun {
    private int tatliid;

    public int getTatliid() {
        return tatliid;
    }

    public void setTatliid(int tatliid) {
        this.tatliid = tatliid;
    }

    @Override
    public String toString() {
        return "tatlilar{" + "tatliid=" + tatliid + '}';
    }

    public tatlilar(int tatliid, int urunid, String urunad, String urunfiyat, int stokid) {
        super(urunid, urunad, urunfiyat, stokid);
        this.tatliid = tatliid;
    }

    public tatlilar(int tatliid) {
        this.tatliid = tatliid;
    }

    public tatlilar() {
    }
    
}
