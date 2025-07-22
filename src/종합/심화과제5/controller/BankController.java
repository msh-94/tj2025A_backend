package 종합.심화과제5.controller; // 패키지명

import 종합.심화과제5.model.dao.AccountDao;
import 종합.심화과제5.model.dao.AccountLogDao;

public class BankController { // class start
    // 싱글톤
    private BankController(){}
    private static final BankController instance = new BankController();
    public static BankController getInstance(){ return instance; }

    // dao 가져오기
    private AccountLogDao accountLogDao = AccountLogDao.getInstance();
    private AccountDao accountDao = AccountDao.getInstance();
}// class end
