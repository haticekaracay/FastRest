/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author haticeozbakir
 */
public class pizzalar extends urun{
    private int pizzaid;
    private String pizzaicerik;

    public int getPizzaid() {
        return pizzaid;
    }

    public void setPizzaid(int pizzaid) {
        this.pizzaid = pizzaid;
    }

    public String getPizzaicerik() {
        return pizzaicerik;
    }

    public void setPizzaicerik(String pizzaicerik) {
        this.pizzaicerik = pizzaicerik;
    }

    @Override
    public String toString() {
        return "pizzalar{" + "pizzaid=" + pizzaid + ", pizzaicerik=" + pizzaicerik + '}';
    }

    public pizzalar(int pizzaid, String pizzaicerik, int urunid, String urunad, String urunfiyat, int stokid) {
        super(urunid, urunad, urunfiyat, stokid);
        this.pizzaid = pizzaid;
        this.pizzaicerik = pizzaicerik;
    }

    public pizzalar(int pizzaid, String pizzaicerik) {
        this.pizzaid = pizzaid;
        this.pizzaicerik = pizzaicerik;
    }

    public pizzalar() {
    }
    
}
