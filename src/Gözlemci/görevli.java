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
public class görevli implements stokObserver{

    @Override
    public void güncelle(String stokbilgisi) {
         System.out.println("stoğa yetkili tarafından ekleme yapıldı");
    }
    
}
