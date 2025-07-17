package 종합.심화과제4.view; // 패키지명

import 종합.심화과제3.AccountLog;
import 종합.심화과제4.controller.BankController;
import 종합.심화과제4.model.dto.AccountLogDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BankView { // class start
    // 싱글톤
    private BankView(){}
    private static final BankView instance = new BankView();

    public static BankView getInstance() {
        return instance;
    }// 싱글톤 end
    // controller 가져오기
    BankController bankController = BankController.getInstance();

    // 스캐너
    Scanner scan = new Scanner(System.in);

    // 처음 화면
    public void screen(){
        for ( ; ; ){
            System.out.println("============= KB Bank ============");
            System.out.println("  1.계좌등록 | 2.입금 | 3.출금 | 4.잔고 | 5.계좌이체 | 6.거래내역");
            System.out.println("==================================");
            System.out.print("선택 > ");
            int i1 = scan.nextInt();
            if (i1 == 1){addBank(); }
            else if (i1 == 2) { inMoney(); }
            else if (i1 == 3){ outMoney(); }
            else if (i1 == 4){ totalMoney(); }
            else if (i1 == 5){ transfer(); }
        }// for end
    }// func end

    // 계좌등록
    public void addBank(){
        System.out.print("계좌번호 : ");
        String 계좌번호 = scan.next();
        System.out.print("비밀번호 : ");
        int 비밀번호 = scan.nextInt();
        boolean result = bankController.addBank(계좌번호,비밀번호);
        if (result){ System.out.println("[안내] 계좌 등록이 완료되었습니다."); }
        else { { System.out.println("[경고] 계좌 등록이 실패하였습니다."); } }
    }// func end

    // 입금
    public  void inMoney(){
        System.out.print("계좌번호 : ");
        String 계좌번호 = scan.next();
        System.out.print("비밀번호 : ");
        int 비밀번호 = scan.nextInt();
        System.out.print("입금액 : ");
        int 입금액 = scan.nextInt();
        boolean result = bankController.inMoney(계좌번호,비밀번호,입금액);
        if (result){ System.out.println("[안내] 입금이 완료되었습니다."); }
        else { System.out.println("[경고] 입금이 실패하였습니다."); }
    } // func end

    // 출금
    public void outMoney(){
        System.out.print("계좌번호 : ");
        String 계좌번호 = scan.next();
        System.out.print("비밀번호 : ");
        int 비밀번호 = scan.nextInt();
        System.out.print("출금액 : ");
        int 출금액 = scan.nextInt();
        int result = bankController.outMoney(계좌번호,비밀번호,출금액);
        if (result == 1){
            System.out.println("[안내] 출금이 완료되었습니다.");
        } else if (result == 2) {
            System.out.println("[경고] 잔액이 부족합니다");
        } else if (result == 0) {
            System.out.println("[경고] 계좌가 일치하지 않습니다.");
        }// if end
    }// func end

    // 잔고조회
    public void totalMoney(){
        System.out.print("계좌번호 : ");
        String 계좌번호 = scan.next();
        System.out.print("비밀번호 : ");
        int 비밀번호 = scan.nextInt();
        int result = bankController.totalMoney(계좌번호,비밀번호);
        if (result != 1){ System.out.println("잔액 : "+result); }
        else { System.out.println("[경고] 계좌가 일치하지 않습니다."); }
    }// func end

    // 계좌이체
    public void transfer(){
        System.out.print("보내는분 : ");
        String 보내는분 = scan.next();
        System.out.print("비밀번호 : ");
        int 비밀번호 = scan.nextInt();
        System.out.print("받는분 : ");
        String 받는분 = scan.next();
        System.out.print("이체금액 : ");
        int 이체금액 = scan.nextInt();
        int result = bankController.transfer(보내는분,비밀번호,받는분,이체금액);
        if (result == 1){
            System.out.println("[안내] 이체가 완료되었습니다.");
        }else if (result == 2){
            System.out.println("[경고] 잔액이 부족합니다");
        } else if (result == 0) {
            System.out.println("[경고] 계좌가 일치하지 않습니다.");
        }// if end
    }// func end

    // 거래내역
    public void transferList(){
        System.out.print("계좌번호 : ");
        String 계좌번호 = scan.next();
        System.out.print("비밀번호 : ");
        int 비밀번호 = scan.nextInt();
        ArrayList<AccountLogDto> result = bankController.transferList(계좌번호,비밀번호);
        if (result != null){
            for (AccountLogDto a1 : result){
                if (a1 != null){
                    System.out.println(a1);
                }//if end
            }// for end

        }// if end
    }// func end
}// class end
