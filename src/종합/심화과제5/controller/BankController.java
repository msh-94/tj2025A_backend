package 종합.심화과제5.controller; // 패키지명

import 종합.심화과제5.model.dao.AccountDao;
import 종합.심화과제5.model.dao.AccountLogDao;
import 종합.심화과제5.model.dto.AccountDto;

public class BankController { // class start
    // 싱글톤
    private BankController(){}
    private static final BankController instance = new BankController();
    public static BankController getInstance(){ return instance; }

    // dao 가져오기
    private AccountLogDao accountLogDao = AccountLogDao.getInstance();
    private AccountDao accountDao = AccountDao.getInstance();

    // 계좌등록 기능
    public boolean bankAdd(String banknum , int apassword){
        AccountDto dto = new AccountDto(banknum,apassword);
        boolean result = accountDao.bankAdd(dto);
        return result;
    }// func end

    // 입금기능
    public boolean inMoney(String banknum , int apassword , int money){
        AccountDto dto = new AccountDto(0,banknum,apassword,money);
        boolean result = accountDao.inMoney(dto);
        return result;
    }// func end

    // 출금기능
    public boolean outMoney(String banknum , int apassword , int money){
        AccountDto dto = new AccountDto(0,banknum,apassword,money);
        boolean result = accountDao.outMoney(dto);
        return result;
    }// func end

    // 잔고조회 기능
    public int getMoney(String banknum , int apassword){
        AccountDto dto = new AccountDto(banknum,apassword);
        AccountDto result = accountDao.getMoney(dto);
        return result.getMoney();
    }// func end
}// class end
