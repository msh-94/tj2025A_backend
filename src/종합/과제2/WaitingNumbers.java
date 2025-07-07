package 종합.과제2;// 패키지명

import java.util.Scanner;

public class WaitingNumbers {// class start

    public static void main(String[] args) {// main start
    // 100팀의 대기 명단을 저장할 수 있는 저장공간 만들기
        Waiting[] waitings = new Waiting[100];
        for ( ; ; ){ // 무한루프
            // 메뉴 화면
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("  1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 > ");
            // 스캐너
            Scanner scan = new Scanner(System.in);
            int i1 = scan.nextInt();
            if (i1 == 1){
                // 전화번호 인원수 입력받기
                System.out.print("전화번호 : ");
                String s1 = scan.next();
                System.out.print("인원수 : ");
                int i2 = scan.nextInt();
                // 객체 생성
                Waiting w1 = new Waiting();
                // 입력받은 내용 생성한 객체 멤버변수에 각각대입
                w1.phone = s1;
                w1.count = i2;
                // 체크용 불리언 만들기
                boolean check = false;
                for (int i = 0; i <= waitings.length-1; i++){
                    if (waitings[i] == null){ // i번째 waitings가 null 이면
                        waitings[i] = w1;
                        check = true;
                        break;
                    }// if end
                }// for end
                if(check){ System.out.println("[안내] 대기 등록이 완료되었습니다."); }
                else { System.out.println("[경고] 더 이상 대기 등록을 할 수 없습니다."); }
            } else if (i1 == 2) {
                System.out.println("============= 대기 현황 =============");
                for (int a = 0; a <= waitings.length-1; a++){
                  if (waitings[a] != null){ // null이 아니면
                      System.out.printf("연락처 : %s - ", waitings[a].phone);
                      System.out.printf("인원 : %s\n", waitings[a].count);
                      System.out.println("------------------------------------");
                  }// if end
                }// for end
            }// if end
        }// for end

    }// main end
}// class end
