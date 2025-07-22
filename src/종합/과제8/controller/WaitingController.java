package 종합.과제8.controller;// 패키지명

import 종합.과제8.model.dao.WaitingDao;
import 종합.과제8.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController { // class start
    // 싱글톤
    private WaitingController(){}
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance(){return instance;}

    // dao 가져오기
    private WaitingDao waitingDao = WaitingDao.getInstance();

    // 등록함수
    public boolean waitAdd(String phone,int count){

        return  waitingDao.waitAdd(phone, count);
    }// func end

    // 전체조회 함수
    public ArrayList<WaitingDto> waitPrint(){
        return waitingDao.waitPrint();
    }// func end
}// class end
