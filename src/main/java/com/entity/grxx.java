package com.entity;

import java.util.Date;

public class grxx {
    private String ygid;

    private String ygxm;

    private String nl;

    private String xb;

    private String sfzhm;

    private Date rcrq;

    private Date lzrq;

    private String bz;

    public String getYgid() {
        return ygid;
    }

    public void setYgid(String ygid) {
        this.ygid = ygid == null ? null : ygid.trim();
    }

    public String getYgxm() {
        return ygxm;
    }

    public void setYgxm(String ygxm) {
        this.ygxm = ygxm == null ? null : ygxm.trim();
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl == null ? null : nl.trim();
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb == null ? null : xb.trim();
    }

    public String getSfzhm() {
        return sfzhm;
    }

    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm == null ? null : sfzhm.trim();
    }

    public Date getRcrq() {
        return rcrq;
    }

    public void setRcrq(Date rcrq) {
        this.rcrq = rcrq;
    }

    public Date getLzrq() {
        return lzrq;
    }

    public void setLzrq(Date lzrq) {
        this.lzrq = lzrq;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }
}