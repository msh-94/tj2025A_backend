package 종합.과제5.controller; // 패키지명

import 종합.과제5.model.dao.WaitingDao;
import 종합.과제5.model.dto.WaitingDto;

public class WaitingController { // class start
    // 싱글톤
    private WaitingController(){}
    private static final WaitingController wco = new WaitingController();
    public static WaitingController getInstance(){
        return wco;
    }// func end

    // dao 객체
    private WaitingDao waitingDao = WaitingDao.getInstance();

    // 등록처리
    public boolean WaitingWrite(String phone , int count){
        WaitingDto waitingDto = new WaitingDto(phone,count);
        boolean result = waitingDao.WaitingWrite(waitingDto);
        return result;
    }// func end

    // 조회처리
    public WaitingDto[] getDto(){
        WaitingDto[] result = waitingDao.getWaitings();
        return result;
    }

}// class end
