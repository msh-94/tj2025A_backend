package 종합.예제5; // 패키지명

public class Board { //클래스 시작
    // 1. 멤버변수
    String content; // 내용
    String writer; // 작성자
    // 2. 생성자
        // ->> 인텔리제이에서 자동 생성자 지원
        // 1. 코드파일내 빈공간을 오른쪽 클릭
        // 2. [생성] --> [생성자]
        // 3. ctrl키 이용한 멤버변수 복수 선택
    public Board(String content, String writer) {
        this.content = content;
        this.writer = writer;
    } // 생성자 끝


    // 3. 메소드
}// 클래스 끝

// * 클래스란 ? 실체(객체) 를 만들기 위한 무형 설계도
