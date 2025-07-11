package 종합.심화과제3; // 패키지명

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankController {// class start
    // 현재 날짜 시간 구하기

    // 멤버변수
    static Account[] accounts = new Account[100];
    AccountLog[] accountLogs = new AccountLog[100];
    // 메소드

    // 등록메소드
    public boolean addBank(String 계좌번호 , int 비밀번호){
        Account ac1 = new Account(계좌번호,비밀번호);
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] == null){
                accounts[i] = ac1;
                return true;
            }// if end
        }// for end
        return false;
    }// 등록메소드 end

    // 유효성검사 메소드
    public static Account check(String 계좌번호 , int 비밀번호){
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] != null){
                if (accounts[i].get계좌번호().equals(계좌번호) && accounts[i].get비밀번호() == 비밀번호){
                    return accounts[i];
                }// if end
            }// if end
        }// for end
        return null;
    }// 유효성검사 메소드 end

    // 입금메소드
    public int inMoney(String 계좌번호 , int 비밀번호 , int 입금액){

        Account result = check(계좌번호,비밀번호);
        result.set잔액(result.get잔액()+입금액);
        addLog(계좌번호,비밀번호).set내역("입금");
        addLog(계좌번호,비밀번호).set입출금("+"+입금액);
        addLog(계좌번호,비밀번호).set현재잔액(result.get잔액());
        addLog(계좌번호,비밀번호).set시간(nowDate());
        return 1;
    }// 입금 메소드 end

    // 출금 메소드
    public int outMoney(String 계좌번호,int 비밀번호,int 출금액){
        if (check(계좌번호,비밀번호).get잔액() >= 출금액){
            check(계좌번호,비밀번호).set잔액(check(계좌번호,비밀번호).get잔액() - 출금액);

            addLog(계좌번호,비밀번호).set내역("출금");
            addLog(계좌번호,비밀번호).set입출금("-"+출금액);
            addLog(계좌번호,비밀번호).set시간(nowDate());
            addLog(계좌번호,비밀번호).set현재잔액(check(계좌번호,비밀번호).get잔액());
            return 1;
        } else if (check(계좌번호,비밀번호).get잔액() < 출금액) {
            return 2;
        }// if end
        return 3;
    }// 출금 메소드 end

    // 잔고확인 메소드
    public int totalMoney(String 계좌번호,int 비밀번호){
        return check(계좌번호,비밀번호).get잔액();
    }// 잔고확인 메소드 end

    // 계좌이체 메소드
    public int postMoney(String 보내는분 , int 비밀번호 , String 받는분 , int 이체금액){
        Account ac = check(보내는분 ,비밀번호);
        Account ac1 = new Account(받는분);
        AccountLog aclog1 = new AccountLog(받는분);
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i].get계좌번호().equals(ac1.get계좌번호())){
                if (ac.get잔액() >= 이체금액){
                    for (int a = 0; a < accountLogs.length; a++){
                        if (accountLogs[a] == null){
                            ac.set잔액(ac.get잔액() - 이체금액);
                            accounts[i].set잔액(accounts[i].get잔액()+이체금액);
                            addLog(보내는분,비밀번호).set시간(nowDate());
                            addLog(보내는분,비밀번호).set내역("이체");
                            addLog(보내는분,비밀번호).set현재잔액(ac.get잔액());
                            addLog(보내는분,비밀번호).set입출금("-"+이체금액);
                            aclog1.set시간(nowDate());
                            aclog1.set내역("이체");
                            aclog1.set현재잔액(ac1.get잔액());
                            aclog1.set입출금("+"+이체금액);
                            accountLogs[a] = aclog1;
                            return 1;
                        }// if end
                    }// for end
                } else if (ac.get잔액() < 이체금액) {
                    return 2;
                }// if end
            }// if end
        }// for end
        return 3;
    }// 계좌이체 메소드 end

    // 날짜 등록 메소드
    public String nowDate(){
        AccountLog aclog = new AccountLog();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String now = formatter.format( LocalDateTime.now() ) ;
        aclog.set시간( now );
        return aclog.get시간();
    }// 날짜등록 메소드 end

    // 로그 조회 메소드
    public AccountLog getAccountLogs(String 계좌번호 , int 비밀번호){
        for (int i = 0; i < accountLogs.length; i++){
            if (accountLogs[i] != null){
                if (accountLogs[i].get계좌번호().equals(계좌번호) && accountLogs[i].get비밀번호() == 비밀번호){
                    return accountLogs[i];
                }// if end
            }// if end
        }// for end
        return null;
    }// 로그조회 메소드 end

    public AccountLog addLog(String 계좌번호,int 비밀번호){
        AccountLog aclog = new AccountLog(계좌번호,비밀번호);
        for (int i = 0 ; i < accountLogs.length; i++){
            if (accountLogs[i] == null){
                accountLogs[i] = aclog;
                return accountLogs[i];
            }// if end
        }// for end
        return null;
    }// log 메소드 end



}// class end
