package day09.package2; // 패키지명

public class C { // 클래스 시작
    // 비공개 멤버변수
    private int 비공개변수;
    // 비공개 멤버변수를 반환하는 공개 메소드 , getter
    public int 반환메소드(){
        // 유효성검사
        return 비공개변수; // 클래스내 비공개 변수 반환
    }// 반환메소드 끝
} // 클래스 끝
