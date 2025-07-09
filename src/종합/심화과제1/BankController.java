package 종합.심화과제1;// 패키지명

public class BankController {// 클래스 시작
    Account[] accounts = new Account[100]; // 100개의 계좌 배열 멤버변수
    Account ac1 = new Account();
    boolean addBank(String 계좌번호 , int 비밀번호){

        ac1.계좌번호 = 계좌번호;
        ac1.비밀번호 = 비밀번호;
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] == null){
                accounts[i] = ac1;
                return true;
            }// if end
        }// for end
        return false;
    }// 등록 메소드 끝

    boolean getMoney(String 계좌번호 , int 비밀번호){

        ac1.계좌번호 = 계좌번호;
        ac1.비밀번호 = 비밀번호;
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] == ac1){
                return true;
            }// if end
        }// for end
        return false;
    }// 잔고 조회 메소드 끝

    boolean inMoney(String 계좌번호 , int 비밀번호 , int 입금액){

        ac1.계좌번호 = 계좌번호;
        ac1.비밀번호 = 비밀번호;
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] == ac1){
                ac1.잔액 += 입금액;
                return true;
            }// if end
        }// for end
        return  false;
    }// 입금 메소드 끝

    boolean outMoney(String 계좌번호 , int 비밀번호 , int 출금액){

        ac1.계좌번호 = 계좌번호;
        ac1.비밀번호 = 비밀번호;
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] == ac1){
                if (ac1.잔액 > 출금액){
                    ac1.잔액 -= 출금액;
                    return true;
                }else if (ac1.잔액 < 출금액){
                    return true;
                }// if end
            }// if end
        }// for end
        return  false;
    }// 출금 메소드 끝




}// 클래스 끝
