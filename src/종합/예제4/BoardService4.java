package 종합.예제4;// 패키지명

import java.util.Scanner;

public class BoardService4 {// 클래스 시작
    public static void main(String[] args) {// main 시작
        BoardController bs = new BoardController();
        for ( ; ; ){
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
                if (bs.doPost(s1,s2)){
                    System.out.println("[안내] 글쓰기 성공");
                }else {
                    System.out.println("[경고] 등록 실패");
                }

            } else if (i1 == 2) {
                System.out.println("============= 게시물 목록 =============");
                Board[] boards = bs.doGet();
                for (int a = 0; a <= boards.length-1; a++) {
                    if (boards[a] != null) {
                        System.out.printf("작성자 : %s\n", boards[a].writer);
                        System.out.printf("내용 : %s\n", boards[a].content);
                        System.out.println("------------------------------------");
                    }// if end
                }// for end
            }
        }



    }// main 끝
}// 클래스 끝
