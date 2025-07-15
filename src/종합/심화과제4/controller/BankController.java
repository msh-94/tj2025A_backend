package 종합.심화과제4.controller; // 패키지명

import 종합.심화과제2.Account;
import 종합.심화과제4.model.dao.AccountDao;
import 종합.심화과제4.model.dao.AccountLogDao;
import 종합.심화과제4.model.dto.AccountDto;

import java.util.ArrayList;

public class BankController { // class start
    // 싱글톤
    private BankController(){}
    private static final BankController instance = new BankController();

    public static BankController getInstance() {
        return instance;
    }// 싱글톤 end
    // dao 가져오기
    AccountDao accountDao = AccountDao.getInstance();
    AccountLogDao accountLogDao = AccountLogDao.getInstance();
    // 리스트 선언
    ArrayList<AccountDto> array1 = new ArrayList<>();
    // 계좌등록
    public boolean addBank(String 계좌번호,int 비밀번호){
        boolean result = false;
        result = accountDao.addBank(계좌번호,비밀번호);
        return result;
    }// func end

    // 유효성 검사
    public AccountDto Validation(String 계좌번호 , int 비밀번호){
        for (int i = 0; i < array1.size(); i++){
            AccountDto ad1 = array1.get(i);
            if (ad1.get계좌번호().equals(계좌번호) && ad1.get비밀번호() == 비밀번호){
                return array1.get(i);
            }// if end
        }// for end
        return null;
    }// func end

    // 계좌번호 유효성 검사
    public AccountDto Validation(String 계좌번호){
        for (int i = 0; i < array1.size(); i++){
            AccountDto ad2 = array1.get(i);
            if (ad2.get계좌번호().equals(계좌번호)){
                return ad2;
            }// if end
        }// for end
        return null;
    }// func end

    // 입금
    public boolean inMoney(String 계좌번호,int 비밀번호,int 입금액){
        boolean result = false;
        if (Validation(계좌번호,비밀번호) != null){
            if (accountDao.inMoney(계좌번호,비밀번호,입금액)){
                result = true;
            }// if end
        }// if end
        return result;
    }// func end

    // 출금
    public int outMoney(String 계좌번호, int 비밀번호 ,int 출금액){
        if (Validation(계좌번호,비밀번호) != null){
            int result = accountDao.outMoney(계좌번호,비밀번호,출금액);
            return result;
        }// if end
       return 0;
    }// func end

    // 잔고조회
    public int totalMoney(String 계좌번호, int 비밀번호){
        if (Validation(계좌번호,비밀번호) != null){
            return accountDao.totalMoney(계좌번호,비밀번호);
        }// if end
        return 0;
    }// func end

    // 계좌이체
    public int transfer(String 보내는분 , int 비밀번호 , String 받는분 , int 이체금액){
        if (Validation(보내는분,비밀번호) != null){
            if (Validation(받는분) != null){
                return accountDao.transfer(보내는분,비밀번호,받는분,이체금액);
            }// if end
        }// if end
        return 0;
    }// func end
} // class end
