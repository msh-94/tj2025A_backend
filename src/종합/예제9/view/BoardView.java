package 종합.예제9.view; // 패키지명

import 종합.예제9.controller.BoardController;
import 종합.예제9.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {// class start
    // 싱글톤
    private BoardView(){}
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance(){
        return instance;
    }
    // controller 가져오기
    private BoardController boardController = BoardController.getInstance();

    // 스캐너
    private Scanner scan = new Scanner(System.in);

    // 메인뷰
    public void index(){
        for (; ; ){
            System.out.println("========================");
            System.out.println("1.등록 2. 전체조회   ");
            System.out.println("========================");
            System.out.print("선택 > ");
            int choose = scan.nextInt();
            if (choose == 1){ boardWrite(); }
            if (choose == 2){ boardPrint(); }
        }// for end
    }// func end

    // 등록뷰
    public void boardWrite(){
        // 1. 입력받기
        System.out.print("내용 : ");      String content = scan.next();
        System.out.print("작성자 : ");     String writer = scan.next();
        // 2. controller 에게 입력받은 값 전달하고 결과 받기
        boolean result = boardController.boardWrite(content,writer);
        // 3. 결과에 따른 출력한다
        if (result){ System.out.println("[안내] 글 작성 성공"); }
        else { System.out.println("[경고] 글 작성 실패"); }
    }// func end

    // 전체조회 뷰
    public void boardPrint(){
        // 1. controller 요청후 결과 받기
        ArrayList<BoardDto> result = boardController.boardPrint();
        // 2. 결과를 반복하여 출력한다.
        for ( BoardDto dto : result){
            System.out.println("작성자 : " + dto.getWriter());
            System.out.println("내용 : " + dto.getContent());
            System.out.println("------------------------------");
        }// for end
    }// func end
}// class end
