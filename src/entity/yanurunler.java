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
public class yanurunler extends urun {
    private int yanid;

    public int getYanid() {
        return yanid;
    }

    public void setYanid(int yanid) {
        this.yanid = yanid;
    }

    @Override
    public String toString() {
        return "yanurunler{" + "yanid=" + yanid + '}';
    }

    public yanurunler(int yanid, int urunid, String urunad, String urunfiyat, int stokid) {
        super(urunid, urunad, urunfiyat, stokid);
        this.yanid = yanid;
    }

    public yanurunler(int yanid) {
        this.yanid = yanid;
    }

    public yanurunler() {
    }
    
}
