package day12.model.dao;

public class MemberDao {
    private MemberDao(){}
    private static final MemberDao instance = new MemberDao();
    public static MemberDao getInstance(){
        return instance;
    }
}// class end
