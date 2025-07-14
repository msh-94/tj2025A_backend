package 종합.예제8.controller;// 패키지명

import 종합.예제8.model.dao.BoardDao;
import 종합.예제8.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {// class start
    // 싱글톤
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return instance;
    }// 싱글톤 end
    // dao 싱글톤 가져오기
    private BoardDao boardDao = BoardDao.getInstance();
    // 등록기능 구현
    public boolean addBoard(String content , String writer){
        boolean result = false;
        // dao 에게 매개변수를 전달하고 결과(리턴) 값을 받는다.
        result = boardDao.addBoard( content , writer);
        return result;
    }// func end
    // 전체조회
    public ArrayList<BoardDto> getBoardList(){
        // dao 에게 요청후 모든 게시물(dto)들을 반환받아 view에게 반환한다
        return boardDao.getBoardList();
    }// func end

}// class end
