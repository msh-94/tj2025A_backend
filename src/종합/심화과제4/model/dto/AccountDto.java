package 종합.심화과제4.model.dto;// 패키지명

import java.util.ArrayList;

public class AccountDto { // class start
    // 매개변수
    private String 계좌번호;
    private int 비밀번호;
    private int 잔액;
    private ArrayList<AccountLogDto> array = new ArrayList<>();
    // 생성자
    public AccountDto(){}// 기본생성자
    public AccountDto(String 계좌번호) {
        this.계좌번호 = 계좌번호;
    }
    public AccountDto(String 계좌번호, int 비밀번호) {
        this.계좌번호 = 계좌번호;
        this.비밀번호 = 비밀번호;
    }

    public AccountDto(String 계좌번호, int 비밀번호, ArrayList<AccountLogDto> array, int 잔액) {
        this.계좌번호 = 계좌번호;
        this.비밀번호 = 비밀번호;
        this.array = array;
        this.잔액 = 잔액;
    }
    // getter setter toString

    public String get계좌번호() {
        return 계좌번호;
    }

    public void set계좌번호(String 계좌번호) {
        this.계좌번호 = 계좌번호;
    }

    public int get비밀번호() {
        return 비밀번호;
    }

    public void set비밀번호(int 비밀번호) {
        this.비밀번호 = 비밀번호;
    }

    public int get잔액() {
        return 잔액;
    }

    public void set잔액(int 잔액) {
        this.잔액 = 잔액;
    }

    public ArrayList<AccountLogDto> getArray() {
        return array;
    }

    public void setArray(ArrayList<AccountLogDto> array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "AccountDto{" +
                "계좌번호='" + 계좌번호 + '\'' +
                ", 비밀번호=" + 비밀번호 +
                ", 잔액=" + 잔액 +
                ", array=" + array +
                '}';
    }
}// class end
