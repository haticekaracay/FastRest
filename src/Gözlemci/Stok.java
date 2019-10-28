/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gözlemci;

/**
 *
 * @author haticeozbakir
 */
public class Stok implements Haber{
  private String stokbilgisi;
    @Override
    public void görevliyeHaberVer() {
       System.out.println("stoktaki ürün miktarı azalımı yetkiliye bildirildi..");
    }
    public void stokEkle( final String stk) {
    this.stokbilgisi = stk;
    görevliyeHaberVer();
  }
    
}
