package 종합.심화과제5.model.dao; // 패키지명

public class AccountLogDao {// class start
    // 싱글톤
    private AccountLogDao(){}
    private static final AccountLogDao instance = new AccountLogDao();
    public static AccountLogDao getInstance(){ return instance; }
}// class end
