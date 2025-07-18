package day12.controller;

import day12.model.dao.BookDao;


public class BookController {
    // 싱글톤
    private BookController(){}
    private static final BookController instance = new BookController();
    public static BookController getInstance(){
        return instance;
    }// 싱글톤 end

    // dao 가져오기
    private BookDao bookDao = BookDao.getInstance();
}// class end
