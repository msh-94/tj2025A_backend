package day08;// 패키지명

public class BankAccount {//클래스시작
    String accountNumber;
    String ownerName;
    int balance;
    BankAccount(String accountNumber,String ownerName , int balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }// 생성자 끝

    int deposit(int 입금액){
        this.balance += 입금액;
        return this.balance;
    }// 입금 메소드 끝

    int withwraw(int 출금액){
        if (this.balance>=출금액){
            this.balance -= 출금액;
            return this.balance;
        }
        return this.balance;
    }// 출금 메소드 끝
}// 클래스끝
