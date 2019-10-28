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
public class sandvicler extends urun{
    private int sandvicid;
    private String sandvicicerik;

    public int getSandvicid() {
        return sandvicid;
    }

    public void setSandvicid(int sandvicid) {
        this.sandvicid = sandvicid;
    }

    public String getSandvicicerik() {
        return sandvicicerik;
    }

    public void setSandvicicerik(String sandvicicerik) {
        this.sandvicicerik = sandvicicerik;
    }

    @Override
    public String toString() {
        return "sandvicler{" + "sandvicid=" + sandvicid + ", sandvicicerik=" + sandvicicerik + '}';
    }

    public sandvicler(int sandvicid, String sandvicicerik, int urunid, String urunad, String urunfiyat, int stokid) {
        super(urunid, urunad, urunfiyat, stokid);
        this.sandvicid = sandvicid;
        this.sandvicicerik = sandvicicerik;
    }

    public sandvicler(int sandvicid, String sandvicicerik) {
        this.sandvicid = sandvicid;
        this.sandvicicerik = sandvicicerik;
    }

    public sandvicler() {
    }
    
}
