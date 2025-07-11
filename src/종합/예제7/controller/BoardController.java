package 종합.예제7.controller; // 패키지명

import 종합.예제7.model.dao.BoardDao;
import 종합.예제7.model.dto.BoardDto;

public class BoardController { //  class start

    // - 싱글톤 만들기
    private BoardController(){}
    private static final BoardController control = new BoardController();
    public static BoardController getInstance(){
        return control;
    } // func end

    // - DAO 객체
    private BoardDao boardDao = BoardDao.getInstance();
    // 1. 등록 처리 메소드 :
    // view에게 전달받은 content,writer 객체로 구성하여 dao 에게 전달후 결과를 view 에게 전달
    public boolean boardWrite(String content , String writer){
        BoardDto boardDto = new BoardDto(content , writer);// 1) 매개변수 객체화
        boolean result = boardDao.boardWrite(boardDto); // 2) dao에게 객체를 전달후 결과 받기
        return result;// 3) dao에게 받은 결과를 view에게 반환하기

    }// func end

    // 2. 조회 처리 메소드
    public BoardDto[] boardPrint(){
        BoardDto[] result = boardDao.boarPrint();// - DAO 에게 게시물 조회 요청후 반환값을 저장한다.
        return result;// dao에게 받은 결과를 반환한다.
    }

} // class end
