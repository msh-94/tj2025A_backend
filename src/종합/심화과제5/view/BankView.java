package 종합.심화과제5.view;// 패키지명

import 종합.심화과제5.controller.BankController;
import 종합.심화과제5.model.dto.AccountLogDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankView { // class start
    // 싱글톤
    private BankView(){}
    private static final BankView instance = new BankView();
    public static BankView getInstance(){ return instance; }

    // controller 가져오기
    private BankController bankController = BankController.getInstance();

    // Scanner
    Scanner scan = new Scanner(System.in);

    // 메인뷰
    public void index(){
        for ( ; ; ){
            try {
                System.out.println("============= KB Bank ============");
                System.out.println("  1.계좌등록 | 2.입금 | 3.출금 | 4.잔고 | 5.계좌이체 | 6.거래내역");
                System.out.println("==================================");
                System.out.print("선택 > ");
                int i1 = scan.nextInt();
                if (i1 == 1) { bankAdd(); }
                else if (i1 == 2) { inMoney(); }
                else if (i1 == 3) { outMoney(); }
                else if (i1 == 4) { getMoney(); }
                else if (i1 == 5) { transfer(); }
                else if (i1 == 6) { getLogList(); }
                else { System.out.println("[경고] 존재하지 않는 번호입니다."); } // if end
            }catch (InputMismatchException e){
                System.out.println("[경고] 입력타입이 일치하지 않습니다.");
                scan = new Scanner(System.in);
            }catch (Exception e){
                System.out.println("[오류] 관리자에게 문의하세요 < 010-0000-0000 >");
            }// try end
        }// foe end
    }// func end

    // 계좌 등록뷰
    public void bankAdd(){
        System.out.print("계좌번호 : ");
        String banknum = scan.next();
        System.out.print("비밀번호 : ");
        int apassword = scan.nextInt();
        boolean result = bankController.bankAdd(banknum,apassword);
        if (result){ System.out.println("[안내] 계좌 등록이 완료되었습니다."); }// if end
        else { System.out.println("[경고] 계좌 등록이 실패하였습니다"); }// else end
    }// func end

    // 입금 뷰
    public void inMoney(){
        System.out.print("계좌번호 : ");
        String banknum = scan.next();
        System.out.print("비밀번호 : ");
        int apassword = scan.nextInt();
        System.out.print("입금액 : ");
        int money = scan.nextInt();
        boolean result = bankController.inMoney(banknum,apassword,money);
        if (result){ System.out.println("[안내] 입금이 완료되었습니다."); } // if end
        else { System.out.println("[경고] 입금이 실패하였습니다"); } // else end
    }// func end

    // 출금 뷰
    public void outMoney(){
        System.out.print("계좌번호 : ");
        String banknum = scan.next();
        System.out.print("비밀번호 : ");
        int apassword = scan.nextInt();
        System.out.print("출금액 : ");
        int money = scan.nextInt();
        int result = bankController.outMoney(banknum,apassword,money);
        if (result == 1){ System.out.println("[안내] 출금이 완료되었습니다."); } // if end
        else if (result == 2){ System.out.println("[경고] 금액이 부족합니다"); } // if end
        else { System.out.println("[경고] 출금이 실패하였습니다"); } // else end
    }// func end

    // 잔고조회 뷰
    public void getMoney(){
        System.out.print("계좌번호 : ");
        String banknum = scan.next();
        System.out.print("비밀번호 : ");
        int apassword = scan.nextInt();
        int result = bankController.getMoney(banknum,apassword);
        if (result < 0){
            System.out.println("[경고] 조회에 실패하였습니다.");
        }else {
            System.out.println("[잔고] "+result+"원");
        }// if end
    }// func end

    // 계좌이체 뷰
    public void transfer(){
        System.out.print("보내는 분 계좌번호 : ");
        String post = scan.next();
        System.out.print("비밀번호 : ");
        int apassword = scan.nextInt();
        System.out.print("받는 분 계좌번호 : ");
        String get = scan.next();
        System.out.print("이체할 금액 : ");
        int money = scan.nextInt();
        int result = bankController.transfer(post,apassword,get,money);
        if (result == 1){ System.out.println("[안내] 이체가 완료되었습니다."); } // if end
        else if (result == 2) { System.out.println("[경고] 금액이 부족합니다"); } // if end
        else { System.out.println("[경고] 이체가 실패하였습니다"); } // else end
    }// func end

    // 거래내역 뷰
    public void getLogList(){
        System.out.print("계좌번호 : ");     String 계좌번호 = scan.next();
        System.out.print("비밀번호 : ");    int 비밀번호 = scan.nextInt();
        ArrayList<AccountLogDto> result = bankController.getLogList(계좌번호,비밀번호);
        for (AccountLogDto dto : result){
            System.out.printf("[%s]\t%s |  %s |  잔액 : %d원\n",dto.getTime(),dto.getContent(),dto.getTransMoney(),dto.getNowMoney());
        }// for end
    }// func end
}// class end
