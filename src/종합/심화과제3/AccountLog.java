package 종합.심화과제3; // 패키지명

public class AccountLog { // class start
    // 멤버변수
    private String 시간;
    private String 내역;
    private String 입출금;
    private int 현재잔액;
    // 생성자
    public AccountLog(){

    }
    public AccountLog(String 시간, String 내역, String 입출금, int 현재잔액) {
        this.시간 = 시간;
        this.내역 = 내역;
        this.입출금 = 입출금;
        this.현재잔액 = 현재잔액;
    } // func end
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

    public void setLog(String 시간 , String 내역 , String 입출금 , int 현재잔액){
        this.시간 = 시간;
        this.내역 = 내역;
        this.입출금 = 입출금;
        this.현재잔액 = 현재잔액;
    }
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
