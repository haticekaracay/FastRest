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
public class salatalar extends urun {
    private int salataid;
    private String salataicerik;

    public int getSalataid() {
        return salataid;
    }

    public void setSalataid(int salataid) {
        this.salataid = salataid;
    }

    public String getSalataicerik() {
        return salataicerik;
    }

    public void setSalataicerik(String salataicerik) {
        this.salataicerik = salataicerik;
    }

    @Override
    public String toString() {
        return "salatalar{" + "salataid=" + salataid + ", salataicerik=" + salataicerik + '}';
    }

    public salatalar(int salataid, String salataicerik, int urunid, String urunad, String urunfiyat, int stokid) {
        super(urunid, urunad, urunfiyat, stokid);
        this.salataid = salataid;
        this.salataicerik = salataicerik;
    }

    public salatalar(int salataid, String salataicerik) {
        this.salataid = salataid;
        this.salataicerik = salataicerik;
    }

    public salatalar() {
    }
    
    
}
