package 종합.예제8.model.dao; // 패키지명

import 종합.예제8.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardDao {// class start
    // 싱글톤
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();

    public static BoardDao getInstance() {
        return instance;
    }// 싱글톤 end
    // 리스트 선언
    private ArrayList<BoardDto> boardDB = new ArrayList<>();
    // 등록기능 구현
    public boolean addBoard( String content , String writer ){
        boolean result = false;
            // 1) 매개변수 값들을 객체화 하기
        BoardDto boardDto = new BoardDto(content , writer);
            // 2) 리스트(db) 에 생성한 객체 대입하기
        boardDB.add(boardDto);
            // 3) 성공시 result 에 성공의 의미 'true' 대입
        result = true;
        return result;
    }// func end
    // 전체조회
    public ArrayList<BoardDto> getBoardList(){
        return boardDB;
    }// func end

}// class end
