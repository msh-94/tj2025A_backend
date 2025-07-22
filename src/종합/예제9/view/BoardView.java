package 종합.예제9.view; // 패키지명

import 종합.예제9.controller.BoardController;

public class BoardView {// class start
    // 싱글톤
    private BoardView(){}
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance(){
        return instance;
    }
    // controller 가져오기
    private BoardController boardController = BoardController.getInstance();
}// class end
