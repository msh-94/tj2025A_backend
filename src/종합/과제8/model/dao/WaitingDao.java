package 종합.과제8.model.dao; // 패키지명

import 종합.과제8.model.dto.WaitingDto;

import java.sql.*;
import java.util.ArrayList;

public class WaitingDao {// class start
    // 싱글톤
    private WaitingDao(){ connectionDB(); }
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){ return instance; }

    // db 연동에 필요한 정보
    private String db_url = "jdbc:mysql://localhost:3306/mydb0722";
    private String db_user = "root";
    private String db_password = "1234";
    Connection conn;

    // db 연동함수
    public void connectionDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(db_url,db_user,db_password);
        }
        catch (ClassNotFoundException e) { System.out.println("[경고] mysql 드라이버 연동 실패"); }
        catch (SQLException e) { System.out.println("[경고] 데이터베이스 연동 실패"); }
    }// func end

    // 등록 함수
    public boolean waitAdd(String phone , int count){
        try {
            if (waitCheck(phone)){
                return false;
            }else {
                String sql = "insert into waiting (phone , count) values('" + phone + "',"+ count +" )";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.execute();
            }// if end
        } catch (SQLException e) { System.out.println("[경고] 등록 실패"); }// try end
        return true;
    }// func end

    // 전체조회 함수
    public ArrayList<WaitingDto> waitPrint(){
        try{
            String sql = "select * from waiting";
            PreparedStatement ps = conn.prepareStatement( sql );
            ResultSet rs = ps.executeQuery();
            ArrayList<WaitingDto> dtos = new ArrayList<>();
            while (rs.next()){
                WaitingDto dto = new WaitingDto();
                dto.setPhone(rs.getString(1));
                dto.setCount(rs.getInt(2));
                dtos.add(dto);
            } // while end
            return dtos;
        } catch (SQLException e) { System.out.println("[경고] 전체 조회 실패"); }// try end
        return null;
    }// func end

    // 동일한 전화번호 찾기
    public boolean waitCheck(String phone){
        try {
            String sql = "select * from waiting where phone ='" + phone + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            boolean result = ps.execute();
            return result;
        } catch (SQLException e) { System.out.println("[경고] 조회 실패"); }
        return false;
    }// func end
}// class end
