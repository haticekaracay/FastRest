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
public class fastrest {
    private int ffid;
    private String restadi;
    private String telefon;
    private int aid;

    public int getFfid() {
        return ffid;
    }

    public void setFfid(int ffid) {
        this.ffid = ffid;
    }

    public String getRestadi() {
        return restadi;
    }

    public void setRestadi(String restadi) {
        this.restadi = restadi;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Override
    public String toString() {
        return "fastrest{" + "ffid=" + ffid + ", restadi=" + restadi + ", telefon=" + telefon + ", aid=" + aid + '}';
    }

    public fastrest(int ffid, String restadi, String telefon, int aid) {
        this.ffid = ffid;
        this.restadi = restadi;
        this.telefon = telefon;
        this.aid = aid;
    }

    public fastrest() {
    }
    
    
}
