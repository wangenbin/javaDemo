package com.opay.entity;

import java.util.Date;

public class Pay {
    private Long id;

    private String userid ;

    private String banknum;

    private String balance;

    private String realname;

    public Long getId() {
        return id;
    }

    public String getUserid() {
        return userid;
    }

    public String getBanknum() {
        return banknum;
    }

    public String getBalance() {
        return balance;
    }

    public String getRealname() {
        return realname;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setBanknum(String banknum) {
        this.banknum = banknum;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }
}
