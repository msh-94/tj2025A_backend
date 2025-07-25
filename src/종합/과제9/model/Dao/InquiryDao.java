package 종합.과제9.model.Dao; // 패키지명

import 종합.과제9.model.Dto.InquiryDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class InquiryDao { // class start
    // 싱글톤
    private InquiryDao(){ connect(); };
    private static final InquiryDao instance = new InquiryDao();
    public static InquiryDao getInstance(){ return instance; }

    // db 연동
    private String db_url = "jdbc:mysql://localhost:3306/과제5";
    private String db_user = "root";
    private String db_password = "1234";
    private Connection conn;
    private void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(db_url,db_user,db_password);
        } catch (Exception e) { System.out.println(e); }// try end
    }// func end

    // 문의 등록 기능
    public boolean inquiryAdd(InquiryDto dto){
        try{
            String sql = "insert into inquiry(i닉네임,i비밀번호,문의내용) values(? ,? ,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,dto.getI닉네임());
            ps.setInt(2,dto.getI비밀번호());
            ps.setString(3,dto.get문의내용());
            int count = ps.executeUpdate();
            if (count >= 1)return true;
            return false;
        } catch (Exception e) { System.out.println(e); } // try end
        return false;
    }// func end

    // 특정물품 문의내역 조회
    public ArrayList<InquiryDto> getInquiry(int 물품번호){
        ArrayList<InquiryDto> dtoList = new ArrayList<>();
        try{
            String sql = "select * from inquiry where 물품번호_pk = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,물품번호);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                InquiryDto dto = new InquiryDto();
                dto.set문의번호(rs.getInt("문의번호_pk"));
                dto.setI닉네임(rs.getString("i닉네임"));
                dto.set문의내용(rs.getString("문의내용"));
                dto.set문의날짜(rs.getString("문의등록날짜"));
                dtoList.add(dto);
            }// while end
        } catch (Exception e) { System.out.println(e); } // try end
        return dtoList;
    }// func end
}// class end
