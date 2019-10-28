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
public class personel {
    private int perid;
    private String perad;
    private String persoyad;
    private String peradres;
    private String pertelefon;
    private String gorevyer;
    private int ffid;

    public int getPerid() {
        return perid;
    }

    public void setPerid(int perid) {
        this.perid = perid;
    }

    public String getPerad() {
        return perad;
    }

    public void setPerad(String perad) {
        this.perad = perad;
    }

    public String getPersoyad() {
        return persoyad;
    }

    public void setPersoyad(String persoyad) {
        this.persoyad = persoyad;
    }

    public String getPeradres() {
        return peradres;
    }

    public void setPeradres(String peradres) {
        this.peradres = peradres;
    }

    public String getPertelefon() {
        return pertelefon;
    }

    public void setPertelefon(String pertelefon) {
        this.pertelefon = pertelefon;
    }

    public String getGorevyer() {
        return gorevyer;
    }

    public void setGorevyer(String gorevyer) {
        this.gorevyer = gorevyer;
    }

    public int getFfid() {
        return ffid;
    }

    public void setFfid(int ffid) {
        this.ffid = ffid;
    }

    @Override
    public String toString() {
        return "personel{" + "perid=" + perid + ", perad=" + perad + ", persoyad=" + persoyad + ", peradres=" + peradres + ", pertelefon=" + pertelefon + ", gorevyer=" + gorevyer + ", ffid=" + ffid + '}';
    }

    public personel(int perid, String perad, String persoyad, String peradres, String pertelefon, String gorevyer, int ffid) {
        this.perid = perid;
        this.perad = perad;
        this.persoyad = persoyad;
        this.peradres = peradres;
        this.pertelefon = pertelefon;
        this.gorevyer = gorevyer;
        this.ffid = ffid;
    }

    public personel() {
    }
    
}
