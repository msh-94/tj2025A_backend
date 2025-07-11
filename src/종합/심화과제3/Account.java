package 종합.심화과제3;// 패키지명

public class Account {// class start
    // 멤버변수
    private String 계좌번호;
    private int 비밀번호;
    private int 잔액;
    private AccountLog[] accountLogs ;
    // 생성자

    public Account(String 계좌번호, int 비밀번호) {
        this.계좌번호 = 계좌번호;
        this.비밀번호 = 비밀번호;
    }// 매개변수 생성자 end

    public Account(String 계좌번호){
        this.계좌번호 = 계좌번호;
    }// 계좌번호 생성자 end
    // getter setter

    public String get계좌번호() {
        return 계좌번호;
    }// get end

    public void set계좌번호(String 계좌번호) {
        this.계좌번호 = 계좌번호;
    }// set end

    public int get비밀번호() {
        return 비밀번호;
    } // get end

    public void set비밀번호(int 비밀번호) {
        this.비밀번호 = 비밀번호;
    } // set end

    public int get잔액() {
        return 잔액;
    } // get end

    public void set잔액(int 잔액) {
        this.잔액 = 잔액;
    }// set end

    public AccountLog[] getAccountLogs() {
        return accountLogs;
    }

    public void setAccountLogs(AccountLog[] accountLogs) {
        this.accountLogs = accountLogs;
    }
    // toString

}// class end
