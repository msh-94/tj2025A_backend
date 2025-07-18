package day12.model.dao;

public class LogDao {
    private LogDao(){}
    private static final LogDao instance = new LogDao();
    public static LogDao getInstance(){
        return instance;
    }
}// class end
