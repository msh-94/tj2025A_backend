package 종합.심화과제5.model.dao; // 패키지명

import 종합.심화과제5.model.dto.AccountDto;

import java.sql.*;

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
            String sql = "update account set money = money + ? where banknum = ? and apassword = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, dto.getMoney());
            ps.setString(2,dto.getBankNum());
            ps.setInt(3,dto.getaPassword());
            int count = ps.executeUpdate();
            if (count == 1)return true;
            return false;
        } catch (Exception e) { System.out.println(e); } // try end
        return false;
    }// func end

    // 출금 기능 구현
    public int outMoney(AccountDto dto){
        try{
            String sql = "update account set money = money - ? where banknum = ? and apassword = ? and money >= ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,dto.getMoney());
            ps.setString(2,dto.getBankNum());
            ps.setInt(3,dto.getaPassword());
            ps.setInt(4,dto.getMoney());
            int count = ps.executeUpdate();
            if (count == 1)return 1;
            return 2;
        } catch (Exception e) { System.out.println(e); }// try end
        return 3;
    }// func end

    // 잔고 조회 기능
    public AccountDto getMoney(AccountDto dto){
        try{
            String sql = "select * from account where banknum = ? and apassword = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,dto.getBankNum());
            ps.setInt(2,dto.getaPassword());
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                AccountDto dtos = new AccountDto();
                dtos.setMoney(rs.getInt("money"));
                return dtos;
            }// while end
        } catch (Exception e) { System.out.println(e); }// try end
        return null;
    }// func end

    // 계좌이체 기능
    public int transfer(AccountDto dto1 , AccountDto dto2 , int money){
        try{
            String sql1 = "update account set money = money - ? where banknum = ? and apassword = ? and money >= ?";
            String sql2 = "update account set money = money + ? where banknum = ?";
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ps1.setInt(1,money);
            ps1.setString(2,dto1.getBankNum());
            ps1.setInt(3,dto1.getaPassword());
            ps1.setInt(4,money);
            ps2.setInt(1,money);
            ps2.setString(2,dto2.getBankNum());
            int count1 = ps1.executeUpdate();
            int count2 = ps2.executeUpdate();
            if (count1 == 1 && count2 == 1)return 1;
            return 2;
        } catch (Exception e) { System.out.println(e); }
        return 3;
    }// func end

    // 계좌번호만 써서 잔고조회
    public AccountDto getMoneys(String 계좌번호){
        try{
            String sql = "select * from account where banknum = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,계좌번호);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                AccountDto dto = new AccountDto();
                dto.setMoney(rs.getInt("money"));
                return dto;
            }// if end
        } catch (SQLException e) { System.out.println(e); }
        return null;
    }// func end
}// class end
