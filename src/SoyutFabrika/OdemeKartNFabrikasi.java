/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoyutFabrika;




/**
 *
 * @author haticeozbakir
 */
public class OdemeKartNFabrikasi implements OdemeNFabrikasi{

    @Override
    public odemeTipi odemeTipiOlustur() {
        return new POSBanka();
    }
    
}
