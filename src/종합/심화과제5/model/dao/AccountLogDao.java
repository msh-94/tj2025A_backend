package 종합.심화과제5.model.dao; // 패키지명

import 종합.심화과제5.model.dto.AccountDto;
import 종합.심화과제5.model.dto.AccountLogDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AccountLogDao {// class start
    // 싱글톤
    private AccountLogDao(){ connect(); }
    private static final AccountLogDao instance = new AccountLogDao();
    public static AccountLogDao getInstance(){ return instance; }

    // db 연동
    private String db_url = "jdbc:mysql://localhost:3306/hardexam1";
    private String db_user = "root";
    private String db_password = "1234";
    private Connection conn;
    private void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(db_url,db_user,db_password);
        } catch (Exception e) { System.out.println(e); }// try end
    }// func end

    // 입출금로그 등록
    public boolean logAdd(AccountLogDto dto){
        try{
            String sql = "insert into accountLog(banknump,content,transmoney,nowmoney) values( ? , ? , ? ,? )";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,dto.getPostbank());
            ps.setString(2, dto.getContent());
            ps.setString(3,dto.getTransMoney());
            ps.setInt(4,dto.getNowMoney());
            int count = ps.executeUpdate();
            if (count == 1)return true;
            return false;
        } catch (Exception e) { System.out.println(e); }// try end
        return false;
    }// func end

    // 이체받는사람 로그 등록
    public boolean getLogAdd(AccountLogDto dto){
        try{
            String sql = "insert into accountLog(banknumr,content,transmoney,nowmoney) values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,dto.getReceivebank());
            ps.setString(2,dto.getContent());
            ps.setString(3,dto.getTransMoney());
            ps.setInt(4,dto.getNowMoney());
            int count = ps.executeUpdate();
            if (count == 1)return true;
            return false;
        } catch (Exception e) { System.out.println(e); }// try end
        return false;
    }// func end

    // 거래내역 조회 기능
    public ArrayList<AccountLogDto> getLogList(AccountLogDto dto , AccountDto dto1){
        ArrayList<AccountLogDto> logList = new ArrayList<>();
        try{
            String sql = "select * from accountLog join account where (banknump = ? or banknumr = ?) and apassword = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,dto.getPostbank());
            ps.setString(2,dto.getReceivebank());
            ps.setInt(3,dto1.getaPassword());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                AccountLogDto ldto = new AccountLogDto();
                ldto.setTime(rs.getString("ltime"));
                ldto.setContent(rs.getString("content"));
                ldto.setTransMoney(rs.getString("transmoney"));
                ldto.setNowMoney(rs.getInt("nowMoney"));
                logList.add(ldto);
            }// while end
        } catch (Exception e) { System.out.println(e); } // try end
        return logList;
    }// func end


}// class end
