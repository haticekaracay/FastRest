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
public class tarih {
    private int tid;
    private String tarih;
    private int satis;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public int getSatis() {
        return satis;
    }

    public void setSatis(int satis) {
        this.satis = satis;
    }

    @Override
    public String toString() {
        return "tarih{" + "tid=" + tid + ", tarih=" + tarih + ", satis=" + satis + '}';
    }

    public tarih(int tid, String tarih, int satis) {
        this.tid = tid;
        this.tarih = tarih;
        this.satis = satis;
    }

    public tarih() {
    }
    
    
    
}
