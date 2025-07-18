package day12.controller;

import day12.model.dao.LogDao;


public class LogController {
    // 싱글톤
    private LogController(){}
    private static final LogController instance = new LogController();
    public static LogController getInstance(){
        return instance;
    }// 싱글톤 end

    // dao 가져오기
    private LogDao logDao = LogDao.getInstance();
}// class end
