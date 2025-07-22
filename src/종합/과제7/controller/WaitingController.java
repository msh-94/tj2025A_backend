package 종합.과제7.controller;// 패키지명

import 종합.과제7.model.dao.WaitingDao;
import 종합.과제7.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController {// class start
    // 싱글톤
    private WaitingController(){}
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance(){
        return instance;
    }

    // dao 불러오기
    private WaitingDao waitingDao = WaitingDao.getInstance();

    // 등록
    public boolean waitAdd(String phone , int count){
        WaitingDto dto = new WaitingDto(phone,count);
        boolean result = waitingDao.waitAdd(dto);
        return result;
    }// func end

    // 전체조회
    public ArrayList<WaitingDto> waitPrint(){
        return waitingDao.waitPrint();
    }// func end
}// class end
