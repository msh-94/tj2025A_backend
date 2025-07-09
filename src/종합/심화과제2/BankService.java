package 종합.심화과제2;// 패키지명

import java.util.Scanner;

public class BankService {// 클래스 시작

    public static void main(String[] args) { // main 시작
        BankController cot = new BankController();
        for ( ; ; ){
            System.out.println("=========== KB Bank ===========");
            System.out.println("  1.계좌등록 | 2.입금 | 3.출금 | 4.잔고 | 5.계좌이체");
            System.out.println("===============================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner(System.in);
            int i1 = scan.nextInt();
            if (i1 == 1){
                System.out.println("--- 계좌 등록 ---");
                System.out.print("계좌번호 : ");
                String s1 = scan.next();
                System.out.print("비밀번호 : ");
                int i2 = scan.nextInt();
                if (cot.addBank(s1,i2)){
                    System.out.println("[안내] 계좌 등록이 완료되었습니다.");
                }else {
                    System.out.println("[경고] 계좌 등록에 실패하였습니다.");
                }// if end
            } else if (i1 == 2) {
                System.out.println("--- 입금 ---");
                System.out.print("계좌번호 : ");
                String s2 = scan.next();
                System.out.print("비밀번호 : ");
                int pw = scan.nextInt();
                System.out.print("입금액 : ");
                int m1 = scan.nextInt();
                if (cot.inMoney(s2 , pw , m1)){
                    System.out.println("[안내] 입금이 완료되었습니다.");
                }else {
                    System.out.println("[경고] 계좌정보가 일치하지 않습니다.");
                }
            } else if (i1 == 3) {
                System.out.println("--- 출금 ---");
                System.out.print("계좌번호 : ");
                String s3 = scan.next();
                System.out.print("비밀번호 : ");
                int pw1 = scan.nextInt();
                System.out.print("출금액 : ");
                int m2 = scan.nextInt();
                int result = cot.outMoney(s3,pw1,m2);
                if (result == 1){
                    System.out.println("[안내] 출금이 완료되었습니다.");
                } else if (result == 2) {
                    System.out.println("[경고] 금액이 부족합니다.");
                } else if (result == 3) {
                    System.out.println("[경고] 계좌정보가 일치하지 않습니다.");
                }// if end
            } else if (i1 == 4) {
                System.out.println("--- 잔고 확인 ---");
                System.out.print("계좌번호 : ");
                String s4 = scan.next();
                System.out.print("비밀번호 : ");
                int pw2 = scan.nextInt();
                int result = cot.totalMoney(s4,pw2);
                if (result != 1){
                    System.out.println("[잔고]"+result+"원\n");
                }else {
                    System.out.println("[경고] 계좌정보가 일치하지 않습니다.");
                }// if end
            } else if (i1 == 5) {
                System.out.println("--- 계좌 이체 ---");
                System.out.print("보내는 분 계좌번호 : ");
                String s5 = scan.next();
                System.out.print("비밀번호 : ");
                int pw3 = scan.nextInt();
                System.out.print("받는 분 계좌번호 : ");
                String s6 = scan.next();
                System.out.print("이체할 금액 : ");
                int i6 = scan.nextInt();
                if (cot.showMoney(s5,pw3,s6,i6) == 1){
                    System.out.println("[안내] 이체가 완료되었습니다.");
                } else if (cot.showMoney(s5,pw3,s6,i6) == 2) {
                    System.out.println("[경고] 잔액이 부족합니다.");
                } else if (cot.showMoney(s5,pw3,s6,i6) == 3) {
                    System.out.println("[경고] 계좌정보가 일치하지 않습니다.");
                }// if end
            }// if end
        }// for end
    } // main 끝
}// 클래스 끝
