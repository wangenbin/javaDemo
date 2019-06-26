package com.opay.entity.req;

public class TransRecords {
    public String user_send;
    public String user_receive;
    public int amount;

    public String getUser_send() {
        return user_send;
    }

    public void setUserSend(String userSend) {
        this.user_send = userSend;
    }

    public String getUserReceive() {
        return user_receive;
    }

    public void setUserReceive(String userReceive) {
        this.user_receive = userReceive;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TransRecords{" +
                "userSend='" + user_send + '\'' +
                ", userReceive='" + user_receive + '\'' +
                ", amount=" + amount +
                '}';
    }
}
