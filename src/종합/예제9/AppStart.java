package 종합.예제9; // 패키지명

import 종합.예제9.controller.BoardController;
import 종합.예제9.model.dto.BoardDto;

import java.util.ArrayList;

public class AppStart {// class start
    public static void main(String[] args) { // main start

        // view 작업 전에 controller/dao 테스트
        // (1) 테스트할 컨트롤러 싱글톤 가져오기
        BoardController bc = BoardController.getInstance();
        // (2) 주석 처리 하면서 단위 기능 테스트
            // 1) 등록 테스트
        boolean result1 = bc.boardWrite("안녕하세요","유재석");
        System.out.println( result1 );
            // 2) 전체조회 테스트
        ArrayList<BoardDto> result2 = bc.boardPrint();
        System.out.println( result2 );

    }// main end
}// class end
