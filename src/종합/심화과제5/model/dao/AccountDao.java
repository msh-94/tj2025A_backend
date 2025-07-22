package 종합.심화과제5.model.dao; // 패키지명

public class AccountDao { // class start
    // 싱글톤
    private AccountDao(){}
    private static final AccountDao instance = new AccountDao();
    public static AccountDao getInstance(){ return instance; }
}// class end
