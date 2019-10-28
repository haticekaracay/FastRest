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
public class dUrunSiparis extends SiparisAlımı{

    @Override
    protected void siparisAl() {
        System.out.println("siparis alınıyor..");
    }

    @Override
    protected void hazirla() {
        System.out.println("siparis hazırlanıyor..");
    }

    @Override
    protected void teslimEt() {
        System.out.println("sipariş teslim ediliyor..");
    }
    
}
