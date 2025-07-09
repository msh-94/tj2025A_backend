package 종합.심화과제2; // 패키지명

public class BankController { // 클래스 시작
    Account[] accounts = new Account[100];
    boolean addBank(String 계좌번호 , int 비밀번호){
        Account ac = new Account(계좌번호 ,비밀번호);
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] == null){
                accounts[i] = ac;
                return true;
            }// if end
        }// for end
        return false;
    }// 등록 메소드 끝

    boolean inMoney(String 계좌번호 , int 비밀번호,int 입금액){

        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] != null){
                if (accounts[i].계좌번호.equals(계좌번호) && accounts[i].비밀번호 == 비밀번호){
                    accounts[i].잔고 += 입금액;
                    return true;
                }// if end

            }// if end
        }// for end
        return false;
    }// 입금 메소드 끝

    int outMoney(String 계좌번호 , int 비밀번호,int 출금액){

        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] != null){
                if (accounts[i].계좌번호.equals(계좌번호) && accounts[i].비밀번호 == 비밀번호){
                    if (accounts[i].잔고 >= 출금액){
                        accounts[i].잔고 -= 출금액;
                        return 1;
                    } else if (accounts[i].잔고 < 출금액) {
                        return 2;
                    }// if end
                }// if end
            }//if end
        }// for end
        return 3;
    }// 출금 메소드 끝

    int totalMoney(String 계좌번호 , int 비밀번호){
        Account ac = new Account(계좌번호 ,비밀번호);
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] != null){
                if (accounts[i].계좌번호.equals(계좌번호) && accounts[i].비밀번호 == 비밀번호){
                    return accounts[i].잔고;
                }// if end
            }

        }// for end
        return 1;
    }// 잔고조회 메소드 끝

    int showMoney(String 보내는분 , int 비밀번호 , String 받는분 , int 이체금액){
        for (int i = 0; i < accounts.length; i++){
            for (int a = 0; a < accounts.length; a++){
                if (accounts[i] != null){
                    if (accounts[i].계좌번호.equals(보내는분) && accounts[i].비밀번호 == 비밀번호) {
                        if (accounts[a].계좌번호.equals(받는분)) {
                            if (accounts[i].잔고 >= 이체금액) {
                                accounts[i].잔고 -= 이체금액;
                                accounts[a].잔고 += 이체금액;
                                return 1;
                            } else if (accounts[i].잔고 < 이체금액) {
                                return 2;
                            }// if end
                        }// if end
                    }// if end
                }// if end
            }// for end
        }// for end
        return 3;
    }// 계좌이체 메소드 끝
} // 클래스 끝
