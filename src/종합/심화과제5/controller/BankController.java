package 종합.심화과제5.controller; // 패키지명

import 종합.심화과제5.model.dao.AccountDao;
import 종합.심화과제5.model.dao.AccountLogDao;
import 종합.심화과제5.model.dto.AccountDto;
import 종합.심화과제5.model.dto.AccountLogDto;

import java.util.ArrayList;

public class BankController { // class start
    // 싱글톤
    private BankController(){}
    private static final BankController instance = new BankController();
    public static BankController getInstance(){ return instance; }

    // dao 가져오기
    private AccountLogDao accountLogDao = AccountLogDao.getInstance();
    private AccountDao accountDao = AccountDao.getInstance();

    /**
     * @param banknum
     * @param apassword
     * @return boolean
     */
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
        if (result){
            AccountDto dto2 = new AccountDto(banknum,apassword);
            int now = accountDao.getMoney(dto2).getMoney();
            AccountLogDto ldto = new AccountLogDto(0,banknum,null,null,"입금","+"+money,now);
            accountLogDao.logAdd(ldto);
        }// if end
        return result;
    }// func end

    // 출금기능
    public int outMoney(String banknum , int apassword , int money){
        AccountDto dto = new AccountDto(0,banknum,apassword,money);
        int result = accountDao.outMoney(dto);
        if (result == 1){
            AccountDto dto2 = new AccountDto(banknum,apassword);
            int now = accountDao.getMoney(dto2).getMoney();
            AccountLogDto ldto = new AccountLogDto(0,banknum,null,null,"출금","-"+money,now);
            accountLogDao.logAdd(ldto);
        }// if end
        return result;
    }// func end

    // 잔고조회 기능
    public int getMoney(String banknum , int apassword){
        AccountDto dto = new AccountDto(banknum,apassword);
        AccountDto result = accountDao.getMoney(dto);
        return result.getMoney();
    }// func end

    // 계좌이체 기능
    public int transfer(String post , int apassword , String get , int money){
        AccountDto dto1 = new AccountDto(0,post,apassword,money);
        AccountDto dto2 = new AccountDto(0,get,0,money);
        int result = accountDao.transfer(dto1,dto2,money);
        AccountDto dto3 = new AccountDto(post,apassword);
        int now = accountDao.getMoney(dto3).getMoney();
        int now2 = accountDao.getMoneys(get).getMoney();
        if (result == 1){
            AccountLogDto ldto = new AccountLogDto(0,post,null,null,"이체","-"+money,now);
            AccountLogDto ldto2 = new AccountLogDto(0,null,get,null,"이체","+"+money,now2);
        }// if end
        return result;
    }// func end

    // 거래내역 출력 기능
    public ArrayList<AccountLogDto> getLogList(String 계좌번호 , int 비밀번호){
        AccountLogDto dto = new AccountLogDto();
        AccountDto dto1 = new AccountDto(계좌번호,비밀번호);
        dto.setPostbank(계좌번호);
        dto.setReceivebank(계좌번호);
        ArrayList<AccountLogDto> result = accountLogDao.getLogList(dto,dto1);
        return result;
    }// func end
}// class end
