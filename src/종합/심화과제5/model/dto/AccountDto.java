package 종합.심화과제5.model.dto; // 패키지명



public class AccountDto { // class start
    // 멤버변수
    private int bno; // 식별번호
    private String bankNum; // 계좌번호
    private int apassword; // 비밀번호
    private int money; // 잔고
    // 생성자 , getter/setter , toString

    public AccountDto() {
    }
    public AccountDto(String bankNum, int password) {
        this.bankNum = bankNum;
        this.apassword = password;
    }
    public AccountDto(int bno, String bankNum, int apassword, int money) {
        this.bno = bno;
        this.bankNum = bankNum;
        this.apassword = apassword;
        this.money = money;
    }

    public String getBankNum() {
        return bankNum;
    }
    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }
    public int getaPassword() {
        return apassword;
    }
    public void setaPassword(int apassword) {
        this.apassword = apassword;
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
                ", password=" + apassword +
                ", money=" + money +
                '}';
    }
}// class end
