package 종합.심화과제3;// 패키지명

import java.util.Scanner;


public class BankService { // class start
    public static void main(String[] args) { // main start
        BankController bco = new BankController();
        for ( ; ; ){
            System.out.println("============= KB Bank ============");
            System.out.println("  1.계좌등록 | 2.입금 | 3.출금 | 4.잔고 | 5.계좌이체 | 6.거래내역");
            System.out.println("==================================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner(System.in);
            int i1 = scan.nextInt();
            if (i1 == 1){
                System.out.print("계좌번호 : ");
                String s1 = scan.next();
                System.out.print("비밀번호 : ");
                int pw = scan.nextInt();
                boolean result = bco.addBank(s1,pw);
                if (result){ System.out.println("[안내] 계좌 등록이 완료되었습니다."); }
                else {System.out.println("[경고] 계좌 등록이 실패하였습니다.");}// if end
            } else if (i1 == 2) {
                System.out.print("계좌번호 : ");
                String s2 = scan.next();
                System.out.print("비밀번호 : ");
                int pw1 = scan.nextInt();
                System.out.print("입금액 : ");
                int i2 = scan.nextInt();
                if (bco.inMoney(s2,pw1,i2) == 1){
                    System.out.println("[안내] 입금이 완료되었습니다.");
                }else {System.out.println("[경고] 입금이 실패하였습니다.");}// if end
            } else if (i1 == 3) {

            } else if (i1 == 4) {

            } else if (i1 == 5) {

            } else if (i1 == 6) {

            }// if end
        }// for end

    }// main end
}// class end
