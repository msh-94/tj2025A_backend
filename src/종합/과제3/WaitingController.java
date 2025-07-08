package 종합.과제3;// 패키지명

public class WaitingController { // WaitingController 클래스 시작(제어/로직)
    Waiting[] waitings = new Waiting[100]; // 멤버변수
    boolean addWaiting(String phone , int count){
        Waiting w1 = new Waiting();
        w1.phone = phone;
        w1.count = count;
        for (int i = 0; i < waitings.length; i++){
            if (waitings[i] == null){
                waitings[i] = w1;
                return true;
            }// if end
        }// for end
        return false;
    }// 메소드 끝

    Waiting[] getWaitingList(){
        return waitings;
    }// 메소드 끝
}// WaitingController 클래스 끝
