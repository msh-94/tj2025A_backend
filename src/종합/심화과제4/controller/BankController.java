package 종합.심화과제4.controller; // 패키지명


import 종합.심화과제4.model.dao.AccountDao;
import 종합.심화과제4.model.dao.AccountLogDao;
import 종합.심화과제4.model.dto.AccountDto;
import 종합.심화과제4.model.dto.AccountLogDto;

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


    // 계좌등록
    public boolean addBank(String 계좌번호,int 비밀번호){
        boolean result = false;
        result = accountDao.addBank(계좌번호,비밀번호);
        return result;
    }// func end

    // AccountDto 유효성 검사
    public AccountDto Validation(String 계좌번호 , int 비밀번호){
        ArrayList<AccountDto> array1 = accountDao.Arrayreturn();
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
        ArrayList<AccountDto> array1 = accountDao.Arrayreturn();
        for (int i = 0; i < array1.size(); i++){
            if (array1.get(i) != null){
                if (array1.get(i).get계좌번호().equals(계좌번호)){
                    return array1.get(i);
                }// if end
            }// if end
        }// for end
        return null;
    }// func end

    // 입금
    public boolean inMoney(String 계좌번호,int 비밀번호,int 입금액){
        AccountDto dto = Validation(계좌번호,비밀번호);
        if (accountDao.inMoney(dto ,입금액)){
            if (accountLogDao.Logadd(Validation(계좌번호,비밀번호),"입금","+"+입금액,dto.get잔액()) == 1){
                return true;
            } // if end
        }// if end
        return false;
    }// func end

    // 출금
    public int outMoney(String 계좌번호, int 비밀번호 ,int 출금액){
        AccountDto dto = Validation(계좌번호,비밀번호);
        int result = accountDao.outMoney(dto,출금액);
        if (result == 1){
            if (accountLogDao.Logadd(Validation(계좌번호,비밀번호),"출금","-"+출금액,dto.get잔액()) == 1){
                return result;
            }// if end
        }// if end
        return result;

    }// func end

    // 잔고조회
    public int totalMoney(String 계좌번호, int 비밀번호){
        AccountDto dto = Validation(계좌번호,비밀번호);
        return accountDao.totalMoney(dto);
    }// func end

    // 계좌이체
    public int transfer(String 보내는분 , int 비밀번호 , String 받는분 , int 이체금액){
        AccountDto dto = Validation(보내는분,비밀번호);
        AccountDto dto1 = Validation(받는분);
        if (accountLogDao.Logadd(Validation(보내는분,비밀번호),"이체","-"+이체금액,dto.get잔액()) == 1){
            if (accountLogDao.Logadd(Validation(받는분),"이체","+"+이체금액,dto1.get잔액()) == 1){
                return accountDao.transfer(dto ,dto1 ,이체금액);
            }// if end
        }// if end
        return accountDao.transfer(dto ,dto1 ,이체금액);
    }// func end

    // 거래내역
    public ArrayList<AccountLogDto> transferList(String 계좌번호, int 비밀번호){
        AccountDto accountDto = Validation(계좌번호,비밀번호);
        for (int i = 0; i < accountDto.getArray().size(); i++){
            AccountLogDto accountLogDto = accountDto.getArray().get(i);
            if (accountLogDto != null){
                return accountLogDao.transferList(accountDto);
            }// if end
        }// for end
        return null;
    }// func end

    // Validation 안의 log빼오기
    public AccountLogDto ValidationLog(String 계좌번호, int 비밀번호){
        AccountDto dto = Validation(계좌번호,비밀번호);
        for (int i = 0; i < dto.getArray().size(); i++){
            if (dto.getArray() != null){
                return dto.getArray().get(i);
            }// if end
        }// for end
        return null;
    }// func end

    // 매개변수 계좌번호로 log빼오기
    public AccountLogDto ValidationLog(String 계좌번호){
        AccountDto dto = Validation(계좌번호);
        for (int i = 0; i < dto.getArray().size(); i++){
            if (dto.getArray() != null){
                return dto.getArray().get(i);
            }// if end
        }// for end
        return null;
    }// func end


} // class end
