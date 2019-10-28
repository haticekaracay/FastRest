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
public class icecekler extends urun {
    private int icecekid;

    public int getIcecekid() {
        return icecekid;
    }

    public void setIcecekid(int icecekid) {
        this.icecekid = icecekid;
    }

    @Override
    public String toString() {
        return "icecekler{" + "icecekid=" + icecekid + '}';
    }

    public icecekler(int icecekid, int urunid, String urunad, String urunfiyat, int stokid) {
        super(urunid, urunad, urunfiyat, stokid);
        this.icecekid = icecekid;
    }

    public icecekler(int icecekid) {
        this.icecekid = icecekid;
    }

    public icecekler() {
    }
    
    
}
