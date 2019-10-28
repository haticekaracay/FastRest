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
public class menuler extends urun {
    private int menuid;
    private String menuicerik;

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public String getMenuicerik() {
        return menuicerik;
    }

    public void setMenuicerik(String menuicerik) {
        this.menuicerik = menuicerik;
    }

    @Override
    public String toString() {
        return "menuler{" + "menuid=" + menuid + ", menuicerik=" + menuicerik + '}';
    }

    public menuler(int menuid, String menuicerik, int urunid, String urunad, String urunfiyat, int stokid) {
        super(urunid, urunad, urunfiyat, stokid);
        this.menuid = menuid;
        this.menuicerik = menuicerik;
    }

    public menuler(int menuid, String menuicerik) {
        this.menuid = menuid;
        this.menuicerik = menuicerik;
    }

    public menuler() {
    }
    
}
