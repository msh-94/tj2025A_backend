package 종합.예제4;// 패키지명

public class BoardController { // BoardController 클래스 시작(로직/제어담당)
    Board[] boards = new Board[100]; // 멤버 변수
    boolean check = false;
    // 메소드
    boolean doPost(String content , String writer){ // 등록 메소드
        Board b1 = new Board();
        b1.content = content;
        b1.writer = writer;
        for (int i = 0; i < boards.length; i++){
            if (boards[i] == null){
                boards[i] = b1;
                check = true;
            }else {
                check = false;
            }// if end
        }// for end
         return check;
    }// doPost 메소드 끝

    Board[] doGet(){// 조회 메소드
        return boards;
    }
}// BoardController 클래스 끝
