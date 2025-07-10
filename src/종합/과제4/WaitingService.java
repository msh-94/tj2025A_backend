package 종합.과제4; // 패키지명

import java.util.Scanner;

public class WaitingService { // class start
    public static void main(String[] args) { // main start
        for ( ; ; ){
            System.out.println("=========== 맛집 대기 시스템 =============");
            System.out.println("  1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner(System.in);
            int i1 = scan.nextInt();
            if (i1 == 1 ){
                System.out.print("전화번호 : ");
                String s1 = scan.next();
                System.out.print("인원수 : ");
                int i2 = scan.nextInt();
                boolean result = WaitingController.addWaiting(s1,i2);
                if (result){ System.out.println("[안내] 대기 등록이 완료되었습니다."); }
                else{  System.out.println("[경고] 대기 등록이 실패하였습니다.");  }// if end
            } else if (i1 == 2) {
                System.out.println("============= 대기 현황 =============");
                Waiting[] waitings = WaitingController.getWaitingList();
                for (int i = 0; i < waitings.length; i++){
                    if (waitings[i] != null){
                        System.out.println("연락처:" +waitings[i].getPhone()+" - 인원: "+waitings[i].getCount()+"명");
                        System.out.println("------------------------------------");
                    }// if end
                }// for end

            }// if end
        }// for end
    }// main end
}// class end
