package 종합.과제4; // 패키지명

public class WaitingController { // class start
    // 멤버변수
    private  static final Waiting[] waitings = new Waiting[100];
    // 메소드
    // 등록 메소드
    public static boolean addWaiting(String phone , int count){
        Waiting waiting = new Waiting(phone, count);
        for (int i = 0; i < waitings.length; i++){
            if (waitings[i] == null){
                waitings[i] = waiting;
                return true;
            }// if end
        }// for end
        return false;
    }// 등록메소드 end
    // 대기현황 조회 메소드
    public static Waiting[] getWaitingList(){
        return waitings;
    }// 대기현황 조회 메소드 end
}// class end
