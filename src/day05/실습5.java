package day05; // 패키지명

import java.util.Scanner;

public class 실습5 {//class start

    public static void main(String[] args) { // main start
//        JAVA] 실습5 : 반복문
//          [ 문제 ] 아래 반복문 관련 문제
//          [ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.
//
//          [문제 1] for문을 사용하여 1부터 10까지의 숫자를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
    //        for(int i = 1; i <= 10; i++){
//              System.out.println(i);
//            }
//
//          [문제 2] for문을 사용하여 10부터 1까지의 숫자를 역순으로 출력하는 프로그램을 작성하시오.
//                for(int i = 10; i >= 1; i--){
//                    System.out.println(i);
//                }
//
//          [문제 3] for문을 사용하여 1부터 50까지 모든 정수의 합계를 구하여 최종 결과를 출력하시오.
//          출력 예시:
//          1부터 50까지의 합계: 1275
//                int i1 = 0;
//                for(int i = 1; i <= 50; i++){
//                    i1 += i;
//                }
//                System.out.println(i1);

//
//          [문제 4] for문과 if문을 사용하여, 1부터 20까지의 숫자 중 짝수만 출력하는 프로그램을 작성하시오.
//            for(int i = 1; i <= 20; i++){
//                if(i%2==0){
//                    System.out.println(i);
//                }//if end
//            }// for  end
//
//          [문제 5] 1부터 30까지의 숫자 중, 3의 배수는 건너뛰고 나머지 숫자만 출력하는 프로그램을 작성하시오.
//          요구 조건: continue 문을 반드시 사용하시오.
//            for (int i = 1; i <= 30; i++){
//                if (i%3==0){
//                    continue;
//                }
//                System.out.println(i);
//            }
//
//          [문제 6] 1부터 순서대로 숫자를 더해나갈 때, 합계가 처음으로 100을 초과하는 시점의 숫자와 그때까지의 합계를 출력하고 반복문을 즉시 종료하시오.
//          요구 조건: break 문을 반드시 사용하시오.
//          출력 예시:
//          14까지 더했을 때 합계가 105로 100을 넘습니다.
//                int i1 = 0;
//                for (int i = 1; ; i++){
//                    i1 += i;
//                    if( i1 > 100){
//                        break;
//                    }
//                }
//                System.out.println(i1);
//
//          [문제 7] 중첩 for문을 사용하여 아래와 같이 별(*)로 이루어진 직각삼각형을 출력하시오.
//          출력 예시:
//          *
//          **
//          ***
//          ****
//          *****
//            String s1 = "";
//            for(int i = 1; i <= 5; i++){
//                for( int a = 1; a <= i; a++){
//                    s1 += "*";
//                }
//                s1 += "\n";
//            }
//            System.out.println(s1);
            // or
//            for (int 줄 = 1; 줄 <= 5; 줄++){
//                for (int 별 = 1; 별 <= 줄; 별 ++){
//                    System.out.print("*");  // 줄바꿈 처리 없는 print 함수 * 출력
//                }//for end
//                System.out.println(); // 줄바꿈 처리
//            }// for end
//
//          [문제 8] 중첩 for문을 사용하여 아래와 같이 별(*)로 이루어진 역직각삼각형을 출력하시오.
//          출력 예시:
//          *****
//          ****
//          ***
//          **
//          *
//            String s1 = "";
//            for(int i = 5; i >= 1; i--){
//                for (int a = 1; a <= i; a++){
//                    s1 += "*";
//                }// for1 end
//                s1 += "\n";
//            }// for 2end
//            System.out.println(s1);
        // or
//            int 전체줄수 = 5;
//            for (int 줄 = 1; 줄 <= 전체줄수; 줄++) {
//                for (int 별 = 1; 별 <= 전체줄수 - 줄 + 1; 별++) {
//                    System.out.print("*");
//                }// for end
//                System.out.println();
//            }

//
//          [문제 9]  Scanner와 무한루프를 사용하여, 사용자가 "end"를 입력할 때까지 계속해서 문자열을 입력받는 프로그램을 작성하시오. "end"가 입력되면,
//          그 전까지 입력된 문자열의 총 횟수를 계산하여 아래 출력 예시와 같이 출력한 뒤 프로그램을 종료하시오.
//          요구 조건:
//          무한루프를 사용하시오 (for(;;) 또는 while(true)).
//          입력 횟수를 저장할 count 변수를 사용하시오.
//          break를 사용하여 루프를 탈출하시오.
//          문자열 비교는 .equals() 메소드를 사용하시오.
//          실행 예시:
//          1회 입력 : 자바
//          2회 입력 : 자바스크립트
//          3회 입력 : 파이썬
//          4회 입력 : HTML
//          5회 입력 : CSS
//          6회 입력 : C언어
//          7회 입력 : end
//          [안내] 프로그램을 종료 합니다.[총 6회 입력]
//        Scanner scan = new Scanner(System.in);
//
//        int count = 0;
//
//        for (;;){
//            count += 1;
//            System.out.printf("%d회 입력 : " , count);
//            String s1 = scan.next();
//            if (s1.equals("end")){
//                break;
//            }
//        }
//        System.out.printf("[안내] 프로그램을 종료 합니다. [총 %d회 입력]" , count-1);
//
//        [문제 10] 아래 선언된 4개의 변수는 7월 각 주차별 매출액입니다. 각 매출액을 '만원' 단위로 변환하고, 백만원 단위마다 '■' 문자로 시각화하여 아래 출력 예시와 같이 보고서를 출력하시오.
//        선언 코드:
//        int july1 = 3532100;
//        int july2 = 9123700;
//        int july3 = 5183400;
//        int july4 = 11738700;
//        요구 조건:
//        매출액을 10000으로 나눈 몫을 사용하여 '만원' 단위를 계산합니다.
//        '만원' 단위 값을 다시 100으로 나눈 몫만큼 for문을 사용하여 '■' 문자를 반복 출력합니다.
//                출력 예시:
//        ------- 7월 매출액 -------
//        1주차 : ■■■353만원
//        2주차 : ■■■■■■■■■912만원
//        3주차 : ■■■■■518만원
//        4주차 : ■■■■■■■■■■■1173만원
//        int i1 = july1/10000;       int in1 = i1/100;
//        int i2 = july2/10000;       int in2 = i2/100;
//        int i3 = july3/10000;       int in3 = i3/100;
//        int i4 = july4/10000;       int in4 = i4/100;
//        System.out.println("------- 7월 매출액 -------");
//        System.out.print("1주차 : ");
//        for (int i = 1; i <= in1; i++){
//            System.out.print("■");
//        }// for1 end
//        System.out.printf("%d만원\n" , i1);
//        System.out.print("2주차 : ");
//        for (int a = 1; a <= in2; a++){
//            System.out.print("■");
//        }// for2 end
//        System.out.printf("%d만원\n" , i2);
//        System.out.print("3주차 : ");
//        for (int i = 1; i <= in3; i++){
//            System.out.print("■");
//        }// for3 end
//        System.out.printf("%d만원\n" , i3);
//        System.out.print("4주차 : ");
//        for (int i = 1; i <= in4; i++){
//            System.out.print("■");
//        }// for4 end
//        System.out.printf("%d만원\n" , i4);



//
//
//        [문제 11]  Scanner와 for(;;) 무한루프를 사용하여 간단한 ATM 기기를 만드시오.
//        요구 조건:
//        사용자에게 "1:입금 | 2:출금 | 3:잔고 | 4:종료" 메뉴를 보여줍니다.
//        Scanner로 메뉴 번호를 입력받습니다.
//        1번을 선택하면 "입금액:"을 물어보고, 입력받은 금액만큼 잔고(balance)를 증가시킵니다.
//        2번을 선택하면 "출금액:"을 물어보고, 입력받은 금액만큼 잔고를 감소시킵니다. (단, 잔고보다 큰 금액은 출금할 수 없다고 안내)
//        3번을 선택하면 현재 잔고를 출력합니다.
//        4번을 선택하면 "프로그램을 종료합니다." 메시지를 출력하고 break를 이용해 무한루프를 탈출합니다.
//        초기 잔고는 0으로 시작합니다.
//        실행 예시:
//        ---------------------------------
//         1:입금 | 2:출금 | 3:잔고 | 4:종료
//        ---------------------------------
//        선택> 1
//        입금액> 10000
//        ---------------------------------
//         1:입금 | 2:출금 | 3:잔고 | 4:종료
//        ---------------------------------
//        선택> 3
//        잔고> 10000
//        ---------------------------------
//        1:입금 | 2:출금 | 3:잔고 | 4:종료
//        ---------------------------------
//        선택> 4
//        프로그램을 종료합니다.
//        int balance = 0;
//        for (; ; ){
//            System.out.println("---------------------------------");
//            System.out.println("1:입금 | 2:출금 | 3:잔고 | 4:종료");
//            System.out.println("---------------------------------");
//            System.out.print("선택 >");
//            int i1 = scan.nextInt();
//            if( i1 == 1){
//                System.out.print("입금액>");
//                int i2 = scan.nextInt();
//                balance += i2;
//            } else if (i1 == 2) {
//                System.out.print("출금액>");
//                int i3 = scan.nextInt();
//                balance -= i3;
//            }else if (i1 == 3){
//                System.out.printf("잔고> %d\n",balance);
//            }else if (i1 == 4){
//                System.out.print("프로그램을 종료합니다.");
//                break;
//            }else{ System.out.println("잘못입력하셨습니다.");} // if end
//        } // for end
    }// main end
}// class end
