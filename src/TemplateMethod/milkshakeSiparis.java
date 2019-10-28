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
public class milkshakeSiparis extends SiparisAlımı {

    @Override
    protected void siparisAl() {
        System.out.println("Milkshake siparişi alındı..");
    }

    @Override
    protected void hazirla() {
        System.out.println("ve Milkshake hazılanıyor..");
    }

    @Override
    protected void teslimEt() {
        System.out.println("Milkshake teslim ediliyor..");
    }
    
}
