package day09;// 패키지명

public class BankAccount { // 클래스 시작
    private String accountNumber; // 멤버변수
    BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }// 생성자 끝

    public String getAccountNumber() {
        return this.accountNumber;
    }// 메소드 끝
}// 클래스 끝
