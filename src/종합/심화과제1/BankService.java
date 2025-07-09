package 종합.심화과제1; // 패키지명

import java.util.Scanner;

public class BankService {// 클래스 시작

    public static void main(String[] args) { // 메인 시작
        BankController controller = new BankController();

        for( ; ; ){
            System.out.println("============== KB Bank  ==============");
            System.out.println("  1.계좌등록 | 2.입금 | 3.출금 | 4.잔고");
            System.out.println("======================================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner(System.in);
            int i1 = scan.nextInt();
            if (i1 == 1){
                System.out.println("--- 계좌 등록 ---");
                System.out.print("계좌번호 : ");
                String s1 = scan.next();
                System.out.print("비밀번호 : ");
                int i2 = scan.nextInt();
                if (controller.addBank(s1 , i2)){
                    System.out.println("[안내] 계좌 등록이 완료되었습니다.");
                }else {
                    System.out.println("[경고] 계좌정보가 일치하지 않습니다");
                }
            }else if (i1 == 2){
                System.out.println("--- 입금 ---");
                System.out.print("계좌번호 : ");
                String s2 = scan.next();
                System.out.print("비밀번호 : ");
                int i3 = scan.nextInt();
                System.out.print("입금액 : ");
                int i4 = scan.nextInt();
                if (controller.inMoney(s2,i3,i4)){
                    System.out.println("[안내] 입금이 완료되었습니다.");
                }else {
                    System.out.println("[경고] 계좌정보가 일치하지 않습니다");
                }// if end
            } else if (i1 == 3) {
                System.out.println("--- 출금 ---");
                System.out.print("계좌번호 : ");
                String s3 = scan.next();
                System.out.print("비밀번호 : ");
                int i5 = scan.nextInt();
                System.out.print("출금액 : ");
                int i6 = scan.nextInt();
                if (controller.inMoney(s3,i5,i6)){
                    System.out.println("[안내] 출금이 완료되었습니다.");
                } else if (controller.outMoney(s3,i5,i6)) {
                    System.out.println("[경고] 잔액이 부족합니다.");
                } else {
                    System.out.println("[경고] 계좌정보가 일치하지 않습니다");
                }// if end
            }else if (i1 == 4){
                System.out.println("--- 잔고확인 ---");
                System.out.print("계좌번호 : ");
                String s4 = scan.next();
                System.out.print("비밀번호 : ");
                int i7 = scan.nextInt();
                if (controller.getMoney(s4,i7)){
                    System.out.println("[잔고] "+controller.ac1.잔액+"원\n");
                }else {
                    System.out.println("[경고] 계좌정보가 일치하지 않습니다");
                }
            }
        }// for end
    }// 메인 끝
}// 클래스 끝
