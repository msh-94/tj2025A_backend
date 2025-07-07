package 종합.예제3;// 패키지명

import java.util.Scanner;

public class BoardService3 {// class start

    public static void main(String[] args) { // main start

        Board[] boards = new Board[100]; // 게시물 100 개 -> 변수2개(객체화) -> 변수1개
        // boards 변수에 Board객체 100개를 저장 가능한 배열자료1개 저장
        // 1. 다양한 속성을 하나의 클래스로 설계하자 content 와 writer 를 하나의 객체화
        // 2. 설계한 클래스/타입 으로 배열 선언
        for ( ; ;){
            System.out.println("============= My Community =============");
            System.out.println("  1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            Scanner scan = new Scanner(System.in);
            System.out.print("선택 > ");
            int i1 = scan.nextInt();
            if (i1 == 1){
                System.out.print("내용 : ");
                String s1 = scan.next();
                System.out.print("작성자 : ");
                String s2 = scan.next();
                Board b1 = new Board(); // for 문 안에서 선언 @@ 밖에서 선언하면 값이 마지막 입력값만 나옴
                b1.contents = s1;   //  멤버변수 대입
                b1.writers = s2;
                boolean check = false;
                for (int i = 0; i <= boards.length-1; i++){
                    if (boards[i] == null){
                        boards[i] = b1; // i번째 요소의 생성한 객체 대입
                        check = true;
                        break;
                    }// if end
                }// for end
                if (check){System.out.println("[안내] 글쓰기 성공");}
                else { System.out.println("[경고] 게시물을 등록할 공간이 부족합니다.");}
            } else if (i1 == 2) {
                System.out.println("============= 게시물 목록 =============");
                for (int a = 0; a <= boards.length-1; a++) {
                    if (boards[a] != null) {
                        System.out.printf("작성자 : %s\n", boards[a].writers);
                        System.out.printf("내용 : %s\n", boards[a].contents);
                        System.out.println("------------------------------------");
                    }// if end
                }// for end
            }// if end
        }// for end
    }// main end
}// class end

class Board{ // Board class start
    String contents;
    String writers;
}// Board class end
