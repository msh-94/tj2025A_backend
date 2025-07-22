package 종합.예제9.controller; // 패키지명

import 종합.예제9.model.dao.BoardDao;

public class BoardController {//class start
    // 싱글톤
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return instance;
    }
    // dao 가져오기
    private BoardDao boardDao = BoardDao.getInstance();
}// class end
