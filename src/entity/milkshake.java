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
public class milkshake {
    private int milkid;
    private String aroma;
    private String fiyat;

    public int getMilkid() {
        return milkid;
    }

    public void setMilkid(int milkid) {
        this.milkid = milkid;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "milkshake{" + "milkid=" + milkid + ", aroma=" + aroma + ", fiyat=" + fiyat + '}';
    }

    public milkshake(int milkid, String aroma, String fiyat) {
        this.milkid = milkid;
        this.aroma = aroma;
        this.fiyat = fiyat;
    }

    public milkshake() {
    }
    
    
}
