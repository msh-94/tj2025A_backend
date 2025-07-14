package 종합.과제6.controller; // 패키지명

import 종합.과제6.model.dao.WaitingDao;
import 종합.과제6.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController { // class start
    // 싱글톤
    private WaitingController(){}
    private static final WaitingController instance = new WaitingController();

    public static WaitingController getInstance() {
        return instance;
    }// 싱글톤 end
    // dao가져오기
    WaitingDao waitingDao = WaitingDao.getInstance();
    // 등록
    public boolean addWaiting(String content , int count){
        boolean result = false;
        result = waitingDao.addWaiting(content,count);
        return result;
    }// func end

    // 전체조회
    public ArrayList<WaitingDto> getWaitingList(){
        return waitingDao.getWaitingList();
    }// func end
} // class end

