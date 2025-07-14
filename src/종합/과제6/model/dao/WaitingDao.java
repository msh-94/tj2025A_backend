package 종합.과제6.model.dao; // 패키지명

import 종합.과제6.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingDao {// class start
    // 싱글톤
    private WaitingDao(){}
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }// 싱글톤 end
    // 리스트 선언
    ArrayList<WaitingDto> waitingDB = new ArrayList<>();
    // 등록구현
    public boolean addWaiting(String phone , int count){
        boolean result = false;
        WaitingDto waitingDto = new WaitingDto(phone , count);
        waitingDB.add(waitingDto);
        result = true;
        return result;
    }// funce end
    // 전체조회
    public ArrayList<WaitingDto> getWaitingList(){
        return waitingDB;
    }// func end
}// class end
