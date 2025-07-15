package 종합.심화과제4.model.dao; // 패키지명


import 종합.심화과제4.controller.BankController;
import 종합.심화과제4.model.dto.AccountDto;

public class AccountDao { // class start
    private AccountDao(){}
    private static final AccountDao instance = new AccountDao();

    public static AccountDao getInstance() {
        return instance;
    }// 싱글톤 end

    // controller 가져오기
    BankController bankController = BankController.getInstance();

    // 계좌 등록
    public boolean addBank(String 계좌번호 , int 비밀번호){
        boolean result = false;
        AccountDto accountDao = new AccountDto(계좌번호,비밀번호);
        result = true;
        return result;
    }// func end

    // 입금
    public boolean inMoney(String 계좌번호, int 비밀번호 , int 입금액){
        bankController.Validation(계좌번호,비밀번호).set잔액(bankController.Validation(계좌번호,비밀번호).get잔액()+입금액);
        return true;
    }// func end

    // 출금
    public int outMoney(String 계좌번호, int 비밀번호 , int 출금액){

        if (bankController.Validation(계좌번호,비밀번호).get잔액() >= 출금액){
            int sum = bankController.Validation(계좌번호,비밀번호).get잔액() - 출금액;
            bankController.Validation(계좌번호,비밀번호).set잔액(sum);
            return 1;
        } else if (bankController.Validation(계좌번호,비밀번호).get잔액() < 출금액) {
            return 2;
        }// if end
        return 0;
    }// func end

    // 잔고조회
    public int totalMoney(String 계좌번호, int 비밀번호){
        bankController.Validation(계좌번호,비밀번호);
        return bankController.Validation(계좌번호,비밀번호).get잔액();
    }// func end

    // 계좌이체
    public int transfer(String 보내는분, int 비밀번호 ,String 받는분, int 이체금액){
        if (bankController.Validation(보내는분,비밀번호).get잔액() >= 이체금액){
            int sum = bankController.Validation(보내는분,비밀번호).get잔액() - 이체금액;
            bankController.Validation(보내는분,비밀번호).set잔액(sum);
            int sum1 = bankController.Validation(받는분).get잔액() + 이체금액;
            bankController.Validation(받는분).set잔액(sum1);
            return 1;
        } else if (bankController.Validation(보내는분,비밀번호).get잔액() < 이체금액) {
            return 2;
        }// if end
        return 0;
    }// func end
}// class end
