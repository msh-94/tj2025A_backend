package 종합.과제5.model.dao; // 패키지명

import 종합.과제5.model.dto.WaitingDto;

public class WaitingDao {// class start
    // 싱글톤
    private WaitingDao(){}
    private static final WaitingDao wao = new WaitingDao();
    public static WaitingDao getInstance(){
        return wao;
    }// func end
    // 멤버변수
    private static final WaitingDto[] waitings = new WaitingDto[100];
    // 등록 메소드
    public boolean WaitingWrite(WaitingDto waitingDto){
        for (int i = 0; i < waitings.length;i++){
            if (waitings[i] == null){
                waitings[i] = waitingDto;
                return true;
            }// if end
        }// for end
        return false;
    }// func end

    // 조회메소드
    public static WaitingDto[] getWaitings() {
        return waitings;
    }
}// class end
