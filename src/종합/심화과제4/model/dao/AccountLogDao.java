package 종합.심화과제4.model.dao; // 패키지명

import 종합.심화과제3.AccountLog;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccountLogDao { // class start
    // 싱글톤
    private AccountLogDao(){}
    private static final AccountLogDao instance = new AccountLogDao();

    public static AccountLogDao getInstance() {
        return instance;
    }// 싱글톤 end

    // 날짜 함수
    public String nowDate(){
        AccountLog aclog = new AccountLog();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String now = formatter.format( LocalDateTime.now() ) ;
        aclog.set시간( now );
        return aclog.get시간();
    }// func end
}// class end
