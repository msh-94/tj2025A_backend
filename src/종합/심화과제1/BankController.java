package 종합.심화과제1;// 패키지명

public class BankController {// 클래스 시작
    Account[] accounts = new Account[100]; // 100개의 계좌 배열 멤버변수

    boolean addBank(String 계좌번호 , int 비밀번호){
        Account ac1 = new Account();
        ac1.계좌번호 = 계좌번호;
        ac1.비밀번호 = 비밀번호;
        ac1.잔액 = 0;
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] == null){
                accounts[i] = ac1;
                return true;
            }// if end
        }// for end
        return false;
    }// 등록 메소드 끝

    int getMoney(String 계좌번호 , int 비밀번호){

        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] != null){
                if (accounts[i].계좌번호.equals(계좌번호) && accounts[i].비밀번호 == 비밀번호){
                    return accounts[i].잔액;
                }// if end
            }

        }// for end
        return 1;
    }// 잔고 조회 메소드 끝

    boolean inMoney(String 계좌번호 , int 비밀번호 , int 입금액){
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] != null){
                if (accounts[i].계좌번호.equals(계좌번호) && accounts[i].비밀번호 == 비밀번호){
                    accounts[i].잔액 += 입금액;
                    return true;
                }// if end
            }// if end

        }// for end
        return  false;
    }// 입금 메소드 끝

    int outMoney(String 계좌번호 , int 비밀번호 , int 출금액){


        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] != null){
                if (accounts[i].계좌번호.equals(계좌번호) && accounts[i].비밀번호 == 비밀번호){
                    if (accounts[i].잔액 >= 출금액){
                        accounts[i].잔액 = accounts[i].잔액 - 출금액;
                        return 0;
                    }else if (accounts[i].잔액 < 출금액){
                        return 1;
                    }// if end
                }// if end
            }

        }// for end
        return  2;
    }// 출금 메소드 끝




}// 클래스 끝
