package 종합.예제9.model.dao; // 패키지명

import 종합.예제9.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardDao { // class start
    // 싱글톤
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){
        return instance;
    }
    // DB 대신할 리스트 선언 < 추후에 사용하지 않음 >
    ArrayList<BoardDto> boardDB = new ArrayList<>();
}// class end
