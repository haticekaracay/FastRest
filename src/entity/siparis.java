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
public class siparis {
    private int sipid;
    private int uid;
    private int odeid;

    public int getSipid() {
        return sipid;
    }

    public void setSipid(int sipid) {
        this.sipid = sipid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getOdeid() {
        return odeid;
    }

    public void setOdeid(int odeid) {
        this.odeid = odeid;
    }

    @Override
    public String toString() {
        return "siparis{" + "sipid=" + sipid + ", uid=" + uid + ", odeid=" + odeid + '}';
    }

    public siparis(int sipid, int uid, int odeid) {
        this.sipid = sipid;
        this.uid = uid;
        this.odeid = odeid;
    }

    public siparis() {
    }
    
}
