package 종합.심화과제3; // 패키지명

public class AccountLog { // class start
    // 멤버변수
    private String 계좌번호;
    private int 비밀번호;
    private String 시간;
    private String 내역;
    private String 입출금;
    private int 현재잔액;
    // 생성자
    public AccountLog(){

    }// 기본생성자

    public AccountLog(String 계좌번호) {
        this.계좌번호 = 계좌번호;
    }// 계좌번호 생성자

    public AccountLog(String 계좌번호 , int 비밀번호){
        this.계좌번호 = 계좌번호;
        this.비밀번호 = 비밀번호;
    }// 유효성용 생성자

    // getter setter

    public String get시간() {
        return 시간;
    }// get 시간 end

    public void set시간(String 시간) {
        this.시간 = 시간;
    } // set 시간 end

    public String get내역() {
        return 내역;
    } // get 내역 end

    public void set내역(String 내역) {
        this.내역 = 내역;
    } // set 내역 end

    public String get입출금() {
        return 입출금;
    } // get 입출금 end

    public void set입출금(String 입출금) {
        this.입출금 = 입출금;
    } // set 입출금 end

    public int get현재잔액() {
        return 현재잔액;
    } // get 현재잔액 end

    public void set현재잔액(int 현재잔액) {
        this.현재잔액 = 현재잔액;
    } // set 현재잔액 end

    public String get계좌번호() {
        return 계좌번호;
    }// get 계좌번호

    public void set계좌번호(String 계좌번호) {
        this.계좌번호 = 계좌번호;
    } // set 계좌번호

    public int get비밀번호() {
        return 비밀번호;
    } // get 비밀번호

    public void set비밀번호(int 비밀번호) {
        this.비밀번호 = 비밀번호;
    }//  set 비밀번호
    // toString

    @Override
    public String toString() {
        return "AccountLog{" +
                "시간='" + 시간 + '\'' +
                ", 내역='" + 내역 + '\'' +
                ", 입출금=" + 입출금 +
                ", 현재잔액=" + 현재잔액 +
                '}';
    } // toString end
}// class end
