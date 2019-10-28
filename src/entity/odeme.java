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
public class odeme {
    private int odeid;
    private String odemetipi;
    private int toptutar;

    public int getOdeid() {
        return odeid;
    }

    public void setOdeid(int odeid) {
        this.odeid = odeid;
    }

    public String getOdemetipi() {
        return odemetipi;
    }

    public void setOdemetipi(String odemetipi) {
        this.odemetipi = odemetipi;
    }

    public int getToptutar() {
        return toptutar;
    }

    public void setToptutar(int toptutar) {
        this.toptutar = toptutar;
    }

    @Override
    public String toString() {
        return "odeme{" + "odeid=" + odeid + ", odemetipi=" + odemetipi + ", toptutar=" + toptutar + '}';
    }

    public odeme(int odeid, String odemetipi, int toptutar) {
        this.odeid = odeid;
        this.odemetipi = odemetipi;
        this.toptutar = toptutar;
    }

    public odeme() {
    }
    
}
