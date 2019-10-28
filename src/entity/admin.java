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
public class admin {
    private int aid;
    private String akullaniciadi;
    private String asifre;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAkullaniciadi() {
        return akullaniciadi;
    }

    public void setAkullaniciadi(String akullaniciadi) {
        this.akullaniciadi = akullaniciadi;
    }

    public String getAsifre() {
        return asifre;
    }

    public void setAsifre(String asifre) {
        this.asifre = asifre;
    }

    @Override
    public String toString() {
        return "admin{" + "aid=" + aid + ", akullaniciadi=" + akullaniciadi + ", asifre=" + asifre + '}';
    }

    public admin(int aid, String akullaniciadi, String asifre) {
        this.aid = aid;
        this.akullaniciadi = akullaniciadi;
        this.asifre = asifre;
    }

    public admin() {
    }
    
    
}
