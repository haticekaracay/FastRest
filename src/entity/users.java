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
public class users {
    private int uid;
    private String uad;
    private String ukullaniciadi;
    private String usifre;
    private int ffid;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUad() {
        return uad;
    }

    public void setUad(String uad) {
        this.uad = uad;
    }

    public String getUkullaniciadi() {
        return ukullaniciadi;
    }

    public void setUkullaniciadi(String ukullaniciadi) {
        this.ukullaniciadi = ukullaniciadi;
    }

    public String getUsifre() {
        return usifre;
    }

    public void setUsifre(String usifre) {
        this.usifre = usifre;
    }

    public int getFfid() {
        return ffid;
    }

    public void setFfid(int ffid) {
        this.ffid = ffid;
    }

    @Override
    public String toString() {
        return "users{" + "uid=" + uid + ", uad=" + uad + ", ukullaniciadi=" + ukullaniciadi + ", usifre=" + usifre + ", ffid=" + ffid + '}';
    }

    public users(int uid, String uad, String ukullaniciadi, String usifre, int ffid) {
        this.uid = uid;
        this.uad = uad;
        this.ukullaniciadi = ukullaniciadi;
        this.usifre = usifre;
        this.ffid = ffid;
    }

    public users() {
    }
    
    
}
