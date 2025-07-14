package 종합.예제8.view;// 패키지명

import 종합.예제8.controller.BoardController;
import 종합.예제8.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView { // class start
    // 싱글톤
    private BoardView(){}
    private static final  BoardView instance = new BoardView();
    public static BoardView getInstance() {
        return instance;
    }// 싱글톤 end
    // controller 싱글톤 가져오기
    private BoardController boardController = BoardController.getInstance();
    // 스캐너
    private Scanner scan = new Scanner(System.in);
    // 화면
    public void index(){
        for ( ; ; ){
            System.out.println("============= My Community =============");
            System.out.println("  1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print("선택 > ");
            int i1 = scan.nextInt();
            if (i1 == 1){ addBoard(); }
            else if (i1 == 2) { getBoardList(); }
        }// for end
    }// func end

    // 등록
    public void addBoard(){
        System.out.print("내용 : ");
        String content = scan.next();
        System.out.print("작성자 : ");
        String writer = scan.next();
        boolean result = boardController.addBoard(content,writer);
        if (result){ System.out.println("[안내] 글쓰기 성공"); }
        else { System.out.println("[경고] 글쓰기 실패"); }
    } // func end

    // 전체조회
    public void getBoardList(){
        // controller 에게 요청후 결과 받기 , view 메소드 먼저 작성시 controller 메소드가 없으므로 오류
        ArrayList<BoardDto> result = boardController.getBoardList();
        // 받은 결과물들을 반복문 출력
        for (int i = 0; i < result.size(); i++){
            BoardDto board = result.get(i);
            System.out.println("작성자 : "+board.getWriter());
            System.out.println("내용 : "+board.getContent());
            System.out.println("------------------------------------");
        }// for end
    }// func end
}// class end
