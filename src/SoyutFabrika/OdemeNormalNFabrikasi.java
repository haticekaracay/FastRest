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
public class OdemeNormalNFabrikasi implements OdemeNFabrikasi{

    @Override
    public odemeTipi odemeTipiOlustur() {
        return new Nakit();
    }
    
}
