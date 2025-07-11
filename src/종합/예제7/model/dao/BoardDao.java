package 종합.예제7.model.dao; // 패키지명

// (역할) 실제 데이터가 존재하는 데이터 접근하는 기능(CRUD)

import 종합.예제7.model.dto.BoardDto;

public class BoardDao { // class start
    // * (싱글톤)
    private BoardDao(){}
    private static final BoardDao bdo = new BoardDao();
    public static BoardDao getInstance(){
        return bdo;
    } // func end

    // * 데이터베이스 : 추후에 데이터베이스로 변경할 예정
    private BoardDto[] boardDB = new BoardDto[100];
    // 1. 등록 처리 메소드 : controller로 부터 db(배열)에 저장할 객체를 받아서 저장한다.
        // 매개변수 : BoardDto , 반환값 : boolean
    public boolean boardWrite(BoardDto boardDto){
        for (int i = 0; i < boardDB.length; i++){ // 빈공간 찾이 위한 인덱스0부터 순회
            if (boardDB[i] == null){ // 배열내 i번째 값이 비어있으면
                boardDB[i] = boardDto; // i번째에 저장할 객체를 대입
                return true;    // 성공의 의미로 'true' 반환
            }// if end
        }// for end
        return false;   // 실패의 의미로 'false' 반환
    } // func end
    // 2. 조회 처리 메소드 : controller로 부터 모든 db(배열)을 반환 한다.
        // 매개변수 : x , 반환값 : BoardDto[]
    public BoardDto[] boarPrint(){
        return boardDB;
    } // func end

} // class end
