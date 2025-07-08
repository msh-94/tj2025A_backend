package 종합.과제3;// 패키지명

import java.util.Scanner;

public class WaitingService {// 클래스 시작

    public static void main(String[] args) {//  main 시작
        WaitingController controller = new WaitingController();
        for ( ; ; ){
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("  1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner(System.in);
            int i1 = scan.nextInt();
            if (i1 == 1){
                System.out.print("전화번호 : ");
                String s1 = scan.next();
                System.out.print("인원수 : ");
                int i2 = scan.nextInt();
                if (controller.addWaiting(s1,i2)){
                    System.out.println("[안내] 대기 등록이 완료되었습니다.");
                }else {
                    System.out.println("[경고] 더 이상 대기 등록을 할 수 없습니다.");
                }// if end
            } else if (i1 == 2) {
                System.out.println("============= 대기 현황 =============");
                Waiting[] w1 = controller.getWaitingList();
                for (int i = 0; i < w1.length; i++){
                    if (w1[i] != null){
                        System.out.printf("연락처 : %s - ", w1[i].phone);
                        System.out.printf("인원 : %s\n", w1[i].count);
                        System.out.println("------------------------------------");
                    }// if end
                }// for end
            }// if end
        }// for end

    }// main 끝
}// 클래스 끝
