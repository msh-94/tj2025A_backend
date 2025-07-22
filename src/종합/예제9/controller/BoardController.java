package 종합.예제9.controller; // 패키지명

import 종합.예제9.model.dao.BoardDao;
import 종합.예제9.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {//class start
    // 싱글톤
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return instance;
    }// func end

    // dao 가져오기 Controller 는 dao만 호출 할수 있다.
    private BoardDao boardDao = BoardDao.getInstance();

    // 등록
    public boolean boardWrite(String content , String writer){
        BoardDto boardDto = new BoardDto(content,writer); // 1. 매개변수를 dto객체 생성
        // 2. 유효성검사(패스) dao에게 저장할 객체를 전달하여 결과 받기
        boolean result = boardDao.boardWrite(boardDto);
        return result;
    }// func end

    // 전체조회
    public ArrayList<BoardDto> boardPrint(){
        // 1. dao에게 매개변수없이 모든 dto 정보를 요청하여 받는다
        ArrayList<BoardDto> result = boardDao.boardPrint();
        // 2. 결과를 view 에게 리턴
        return result;
    }// func end

}// class end
