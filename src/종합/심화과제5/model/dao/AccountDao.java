package 종합.심화과제5.model.dao; // 패키지명

import 종합.심화과제5.model.dto.AccountDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AccountDao { // class start
    // 싱글톤
    private AccountDao(){connect();}
    private static final AccountDao instance = new AccountDao();
    public static AccountDao getInstance(){ return instance; }

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

    // 등록기능 구현
    public boolean bankAdd(AccountDto dto){
        try {
            String sql = "insert into account(banknum,apassword) values(? , ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, dto.getBankNum());
            ps.setInt(2,dto.getaPassword());
            int count = ps.executeUpdate();
            if (count >= 1)return true;
            return false;
        }catch (Exception e){ System.out.println(e); }// try end
        return false;
    }// func end

    // 입금 기능 구현
    public boolean inMoney(AccountDto dto){
        try{
            String sql = "update account set money = + ? where banknum = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, dto.getMoney());
            ps.setString(2,dto.getBankNum());
            int count = ps.executeUpdate();
            if (count == 1)return true;
            return false;
        } catch (Exception e) { System.out.println(e); } // try end
        return false;
    }// func end

    // 출금 기능 구현
    public boolean outMoney(AccountDto dto){
        try{
            String sql = "update account set money = - ? where banknum = ? and money >= ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,dto.getMoney());
            ps.setString(2,dto.getBankNum());
            ps.setInt(3,dto.getMoney());
            int count = ps.executeUpdate();
            if (count == 1)return true;
            return false;
        } catch (Exception e) { System.out.println(e); }// try end
        return false;
    }// func end
}// class end
