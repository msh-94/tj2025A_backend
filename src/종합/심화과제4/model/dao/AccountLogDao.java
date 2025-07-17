package 종합.심화과제4.model.dao; // 패키지명

import 종합.심화과제3.AccountLog;
import 종합.심화과제4.model.dto.AccountDto;
import 종합.심화과제4.model.dto.AccountLogDto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class AccountLogDao { // class start
    // 싱글톤
    private AccountLogDao(){}
    private static final AccountLogDao instance = new AccountLogDao();

    public static AccountLogDao getInstance() {
        return instance;
    }// 싱글톤 end

    // 리스트 선언
    ArrayList<AccountLogDto> array2 = new ArrayList<>();
    // 리스트 반환함수
    public ArrayList<AccountLogDto> getArray2() {
        return array2;
    }// func end

    // 날짜 함수
    public String nowDate(){
        AccountLog aclog = new AccountLog();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String now = formatter.format( LocalDateTime.now() ) ;
        aclog.set시간( now );
        return aclog.get시간();
    }// func end

    // 로그 등록
    public int Logadd( AccountDto accountDto,String 사유 , String 입출금, int 현재잔액){
        if (accountDto != null){
            AccountLogDto accountLogDto = new AccountLogDto(nowDate(),사유,입출금,현재잔액);
            accountDto.getArray().add(accountLogDto);
            return 1;
        }// if end
        return 2;
    }// func end

    // 거래내역 목록
    public ArrayList<AccountLogDto> transferList(AccountDto accountDto){
        return accountDto.getArray();
    }// func end
}// class end
