/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author haticeozbakir
 */
public class CikolataSos extends SosDecorator {
   
    public CikolataSos(final Milkshake milkshake){
        super(milkshake);
    }

    @Override
    public void milkshk() {
        System.out.println("cikolata soslu milkshake");
    }

    @Override
    public double fiyat() {
        return 1+milkshake.fiyat();
    }
    
    
}
