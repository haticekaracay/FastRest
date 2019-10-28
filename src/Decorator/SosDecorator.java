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
public abstract class SosDecorator implements Milkshake {
    protected Milkshake milkshake;
      public SosDecorator(Milkshake milkshake){
          this.milkshake=milkshake;
      }
    
}
