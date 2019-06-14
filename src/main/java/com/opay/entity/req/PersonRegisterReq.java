package com.opay.entity.req;


import java.util.Date;

public class PersonRegisterReq {
    /**
     * 姓名
     */
    private String nickName ;
    /**
     * 银行卡号
     */
    private String   bankNo;
    /**
     * 身份证号
     */
    private String   idCard;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 手机号
     */
    private String   mobile;
    /**
     * 发卡银行支行名称
     */
    private String  bankBranch;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    public String getNickName() {
        return nickName;
    }

    public String getBankNo() {
        return bankNo;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getMobile() {
        return mobile;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public String getRealName() {
        return realName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "PersonRegisterReq{" +
                "nickName='" + nickName + '\'' +
                ", bankNo='" + bankNo + '\'' +
                ", idCard='" + idCard + '\'' +
                ", passWord='" + passWord + '\'' +
                ", mobile='" + mobile + '\'' +
                ", bankBranch='" + bankBranch + '\'' +
                ", realName='" + realName + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
