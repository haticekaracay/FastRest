/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author haticeozbakir
 */
public abstract class SiparisAlımı {
    public void siparis() {
    siparisAl();
    hazirla();
    teslimEt();
  }

  protected abstract void siparisAl();

  protected abstract void hazirla();

  protected abstract void teslimEt();
  
  
  public void siparissAl(){
     siparisAl();
  }
  
  public void hazirlaa(){
    hazirla();
  }
  
  public void teslimmEt(){
    teslimEt();
  }
}
