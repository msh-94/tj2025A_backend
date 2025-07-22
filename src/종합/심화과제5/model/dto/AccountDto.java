package 종합.심화과제5.model.dto; // 패키지명

import java.util.ArrayList;

public class AccountDto { // class start
    // 멤버변수
    private String bankNum;
    private int password;
    private int money;
    // 생성자 , getter/setter , toString

    public AccountDto() {
    }
    public AccountDto(String bankNum, int password) {
        this.bankNum = bankNum;
        this.password = password;
    }

    public String getBankNum() {
        return bankNum;
    }
    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "AccountDto{" +
                "bankNum='" + bankNum + '\'' +
                ", password=" + password +
                ", money=" + money +
                '}';
    }
}// class end
