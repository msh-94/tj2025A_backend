package 종합.예제7.view; // 패키지명

import java.util.Scanner;

// ( 역할 ) 게시물 관련 입출력 클래스
public class BoardView { // class start
    // (*) 싱글톤 만들기 1~3단계
    private BoardView(){} // 1단계
    private static final BoardView view = new BoardView(); // 2단계
    public static BoardView getInstance(){ // (3단계)
        return view; //
    }

    // (*) 여러 메소드에서 사용할 입력 개체를 멤버변수로 선언
    private Scanner scan = new Scanner( System.in );

    // (1) 메인view : 최초로 보이는 화면
    public void index(){
        for ( ; ; ){
            System.out.println("============= My Community =============");
            System.out.println("  1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print("선택 > ");
            int i1 = scan.nextInt();
            if (i1 == 1){ boardWrite(); }
            else if (i1 == 2) { boardPrint(); }
        }// for end
    } // 메소드 end

    // (2) 등록 view
    public void boardWrite(){
        System.out.print("내용 : ");
        System.out.print("작성자 : ");
        System.out.println("[안내] 글쓰기 성공");
    }
    // (3) 조회 view
    public void boardPrint(){
        System.out.println("============= 게시물 목록 =============");
        System.out.print("작성자 : ");
        System.out.print("내용 : ");
        System.out.println("------------------------------------");
    }

}// class end
