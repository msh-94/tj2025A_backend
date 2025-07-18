package day12.model.dao;

public class BookDao {
    private BookDao(){}
    private static final BookDao instance = new BookDao();
    public static BookDao getInstance(){
        return instance;
    }
}// class end
