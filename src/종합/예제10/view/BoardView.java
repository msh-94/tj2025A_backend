package 종합.예제10.view;// 패키지명

import 종합.예제10.controller.BoardController;
import 종합.예제10.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {// class start
    // 싱글톤
    private BoardView(){}
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance(){ return instance; }

    // controller 가져오기
    private BoardController boardController = BoardController.getInstance();

    // 스캐너
    private Scanner scan = new Scanner(System.in);

    // 메인 뷰
    public void index(){
        for ( ; ; ){
            try {
                System.out.println("=========== 비회원 게시판 ===========");
                System.out.println("1.등록 2.전체조회 3.삭제 4.수정");
                System.out.print("선택 > ");
                int i1 = scan.nextInt();
                if (i1 == 1){ boardWrite(); }
                else if (i1 == 2){ boardPrint(); }
                else if (i1 == 3){ boardDelete(); }
                else if (i1 == 4){ boardUpdate(); }
                else{ System.out.println("[경고] 존재하지 않는 번호입니다."); } // if end
            }catch (InputMismatchException e){
                System.out.println("[경고] 입력 타입이 일치하지 않습니다.");
                scan = new Scanner(System.in); // 입력에 따른 입력객체 초기화 : 잘못된 데이터 지우기
            }//catch end
            catch (Exception e) { System.out.println("[오류] 관리자에게 문의 <010-1111-1111>"); }// try end
        }// for end
    }// func end

    // 등록 뷰
    public void boardWrite(){
        // 1. 입력받기
        scan.nextLine();
        System.out.print("내용 : ");            String bcontent = scan.nextLine(); // nextLine() : 띄어쓰기 가능
        System.out.print("작성자 : ");           String bwriter = scan.next(); // next() : 띄어쓰기 불가능
        // 2. controller 전달하기 // 3. 전달후 (결과)리턴값 저장하기
        boolean result = boardController.boardWriter(bcontent,bwriter);
        // 4. 리턴된 값 에 따른 출력하기
        if (result){ System.out.println("[안내] 게시물 작성 성공"); }// if end
        else { System.out.println("[경고] 게시물 작성 실패"); } // else end
    }// func end

    // 전체조회 뷰
    public void boardPrint(){
        // 1. controller 에게 요청후 결과 받기
        ArrayList<BoardDto> result = boardController.boardPrint();
        // 2. 결과에 따른 화면 구현
        for (BoardDto dto : result){ // 향상된 for문 , for( 항목타입 변수명 : 리스트명 ){}
            System.out.printf("게시물번호 : %d\t작성자 : %s\t내용 : %s\n",dto.getBno(),dto.getBwriter(),dto.getBcontent());
            System.out.println("----------------------------------------------------");
        }// for end
    }// func end

    // 삭제 뷰
    public void boardDelete(){
        System.out.print("게시물 번호 : ");      int bno = scan.nextInt();
        boolean result = boardController.boardDelete(bno);
        if (result){ System.out.println("[안내] 게시물 삭제 성공"); } // if end
        else { System.out.println("[경고] 게시물 삭제 실패"); } // else end
    }// func end

    // 수정 뷰
    public void boardUpdate(){
        System.out.print("게시물 번호 : ");      int bno = scan.nextInt();   scan.nextLine();
        System.out.print("수정할 내용 : ");      String bcontent = scan.nextLine();
        boolean result = boardController.boardUpdate(bno,bcontent);
        if (result){ System.out.println("[안내] 게시물 수정 성공"); } // if end
        else { System.out.println("[경고] 게시물 수정 실패"); } // else end
    }// func end
}// class end
