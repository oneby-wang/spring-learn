package com.oneby.entity;

/**
 * @ClassName Account
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/23 23:51
 * @Version 1.0
 */
public class Account {

    private Integer accountId;
    private String accountName;
    private Integer accountBalance;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
