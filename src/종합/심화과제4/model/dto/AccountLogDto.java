package 종합.심화과제4.model.dto; // 패키지명

public class AccountLogDto { // class start
    // 멤버변수
    private String 시간;
    private String 사유;
    private String 입출금;
    private int 현재잔액;
    // 생성자
    public AccountLogDto() { } // 기본생성자
    public AccountLogDto(String 시간, String 사유, String 입출금, int 현재잔액) {
        this.시간 = 시간;
        this.사유 = 사유;
        this.입출금 = 입출금;
        this.현재잔액 = 현재잔액;
    } // 매개변수 생성자
    // getter setter toString

    public String get시간() {
        return 시간;
    }

    public void set시간(String 시간) {
        this.시간 = 시간;
    }

    public String get사유() {
        return 사유;
    }

    public void set사유(String 사유) {
        this.사유 = 사유;
    }

    public String get입출금() {
        return 입출금;
    }

    public void set입출금(String 입출금) {
        this.입출금 = 입출금;
    }

    public int get현재잔액() {
        return 현재잔액;
    }

    public void set현재잔액(int 현재잔액) {
        this.현재잔액 = 현재잔액;
    }

    @Override
    public String toString() {
        return "AccountLogDto{" +
                "시간='" + 시간 + '\'' +
                ", 사유='" + 사유 + '\'' +
                ", 입출금='" + 입출금 + '\'' +
                ", 현재잔액=" + 현재잔액 +
                '}';
    }
}// class end
