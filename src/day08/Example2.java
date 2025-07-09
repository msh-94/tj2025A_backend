package day08;// 패키지명

class 학생설계도{
    // 멤버변수 = 속성/상태/특징/데이터
    String name;    // 이름
    String lunchBox;   // 점심도시락

    // 메소드 = 이벤트/행위/동작/사용법
    void 밥먹기(){
        System.out.println(name+" 은 " + lunchBox+"먹습니다.");
    }

}// 학생설계도 클래스 끝

public class Example2 { // 클래스 시작
    public static void main(String[] args) { // main 시작

        // 18번째 줄 기준 클래스 1개 , 객체 x
        학생설계도 s1 = new 학생설계도();
        s1.name = "유재석";
        s1.lunchBox = "신라면";
        // 22번째 줄 기준 클래스 1개 , 객체 1개
        학생설계도 s2 = new 학생설계도();
        s2.name = "강호동";
        s2.lunchBox = "김밥";
        // 26번째 줄 기준 클래스 1개 , 객체 2개
        s2.밥먹기(); // 강호동 은 김밥 먹습니다.
        s1.밥먹기(); // 유재석 은 신라면 먹습니다.
        s2.밥먹기(); // 강호동 은 김밥 먹습니다.

        //
        학생설계도[] 학생명단 = new 학생설계도[100];
        학생명단[0] = s1;

        //
        학생명단[0].밥먹기(); // 유재석 은 신라면 먹습니다.

        //
        int a = 3;
        int b = a;
        System.out.println(b); // 3
    }// main 끝
}// 클래스 끝
