package 종합.과제9.model.Dao; // 패키지명

import java.sql.Connection;
import java.sql.DriverManager;

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
}// class end
