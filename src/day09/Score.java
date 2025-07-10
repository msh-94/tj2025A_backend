package day09; // 패키지명

public class Score { // 클래스 시작
    private int score; // 멤버변수
    public void setScore(int score){
        if (score >= 0 && score <= 100){
            this.score = score;
        }else {
            System.out.println("유효하지 않은 점수입니다.");
        }// if end
    }// 메소드 끝
}// 클래스 끝
