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
public class Vanilyali implements Milkshake{

    @Override
    public void milkshk() {
       System.out.println("vanilyali");
    }

    @Override
    public double fiyat() {
       return 6;
    }

 
    
}
