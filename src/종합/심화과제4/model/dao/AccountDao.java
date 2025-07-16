package 종합.심화과제4.model.dao; // 패키지명



import 종합.심화과제4.model.dto.AccountDto;

import java.util.ArrayList;

public class AccountDao { // class start
    private AccountDao(){}
    private static final AccountDao instance = new AccountDao();

    public static AccountDao getInstance() {
        return instance;
    }// 싱글톤 end

    // 리스트 선언
    ArrayList<AccountDto> array1 = new ArrayList<>();

    // 리스트 반환함수
    public ArrayList<AccountDto> Arrayreturn(){
        return array1;
    }// func end

    // 계좌 등록
    public boolean addBank(String 계좌번호 , int 비밀번호){
        boolean result = false;
        AccountDto accountDto = new AccountDto(계좌번호,비밀번호);
        array1.add(accountDto);
        result = true;
        return result;
    }// func end

    // 입금
    public boolean inMoney(AccountDto dto, int 입금액){
        dto.set잔액(dto.get잔액()+입금액);
        return true;
    }// func end

    // 출금
    public int outMoney(AccountDto dto , int 출금액){

        if (dto.get잔액() >= 출금액){
            int sum = dto.get잔액() - 출금액;
            dto.set잔액(sum);
            return 1;
        } else if (dto.get잔액() < 출금액) {
            return 2;
        }// if end
        return 0;
    }// func end

    // 잔고조회
    public int totalMoney(AccountDto dto){
        return dto.get잔액();
    }// func end

    // 계좌이체
    public int transfer(AccountDto dto , AccountDto dto1 ,int 이체금액){
        if (dto.get잔액() >= 이체금액){
            int sum = dto.get잔액() - 이체금액;
            dto.set잔액(sum);
            int sum1 = dto1.get잔액() + 이체금액;
            dto1.set잔액(sum1);
            return 1;
        } else if (dto.get잔액() < 이체금액) {
            return 2;
        }// if end
        return 0;
    }// func end
}// class end
