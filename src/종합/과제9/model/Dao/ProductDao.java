package 종합.과제9.model.Dao; // 패키지명

import 종합.과제9.model.Dto.ProductDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDao { // class start
    // 싱글톤
    private ProductDao(){ connect(); }
    private static final ProductDao instance = new ProductDao();
    public static ProductDao getInstance(){ return instance; }

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

    // 물품 등록기능 구현
    public boolean productAdd(ProductDto dto){
        try{
            String sql = "insert into product (닉네임,비밀번호,물품명,가격,설명) values(? , ? ,? ,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, dto.get닉네임());
            ps.setInt(2,dto.get비밀번호());
            ps.setString(3,dto.get물품명());
            ps.setInt(4,dto.get가격());
            ps.setString(5,dto.get설명());
            int count = ps.executeUpdate();
            if (count >= 1)return true;
            return false;
        } catch (Exception e) { System.out.println(e); }// try end
        return false;
    }// func end

    // 전체 물품조회
    public ArrayList<ProductDto> getProductList(){
        ArrayList<ProductDto> dtoList = new ArrayList<>();
        try{
            String sql = "select * from product";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ProductDto dto = new ProductDto();
                dto.set물품번호(rs.getInt("물품번호_pk"));
                dto.set물품명(rs.getString("물품명"));
                dto.set가격(rs.getInt("가격"));
                dto.set닉네임(rs.getString("닉네임"));
                dto.set등록날짜(rs.getString("등록날짜"));
                dto.set판매여부(rs.getString("판매여부"));
                dtoList.add(dto);
            }// while end
        } catch (Exception e) { System.out.println(e); } // try end
        return dtoList;
    }// func end

    // 물품수정 기능
    public boolean productUpdate(ProductDto dto){
        try{
            String sql = "update product set 물품명 = ? , 가격 = ? , 설명 = ? , 판매여부 = ? where 물품번호_pk = ? and 비밀번호 = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,dto.get물품명());
            ps.setInt(2,dto.get가격());
            ps.setString(3,dto.get설명());
            ps.setString(4,dto.get판매여부());
            ps.setInt(5,dto.get물품번호());
            ps.setInt(6,dto.get비밀번호());
            int count = ps.executeUpdate();
            if (count == 1)return true;
            return false;
        } catch (Exception e) { System.out.println(e); }// try end
        return false;
    }// func end

    // 물품 삭제 기능
    public boolean productDelete(ProductDto dto){
        try{
            String sql = "delete from product where 물품번호_pk = ? and 비밀번호 = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,dto.get물품번호());
            ps.setInt(2,dto.get비밀번호());
            int count = ps.executeUpdate();
            if (count == 1)return true;
            return false;
        } catch (Exception e) { System.out.println(e); } // try end
        return false;
    }// func end

    // 특정물품 조회 기능
    public ProductDto getProduct(int 물품번호){
        try{
            String sql = "select * from product where 물품번호_pk = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,물품번호);
            ResultSet rs = ps.executeQuery();
            ProductDto dto = new ProductDto(물품번호,rs.getString("닉네임"),rs.getInt("비밀번호"),
                    rs.getString("물품명"),rs.getInt("가격"),rs.getString("설명"),
                    rs.getString("판매여부"),rs.getString("등록날짜"));
            return dto;
        } catch (Exception e) { System.out.println(e); }
        return null;
    }// func end

    // 랭킹조회 기능
    public ArrayList<ProductDto> getRank(){
        ArrayList<ProductDto> dtoList = new ArrayList<>();
        try{
            String sql = "select 닉네임,count(등록날짜) as 등록수 from product group by 닉네임 order by 등록수 desc limit 0 ,10";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ProductDto dto = new ProductDto();
                dto.set닉네임(rs.getString("닉네임"));
                dto.set가격(rs.getInt("등록수"));
                dtoList.add(dto);
            }// while end
        } catch (Exception e) { System.out.println(e); } // try end
        return dtoList;
    }// func end

    // 검색 기능
    public ArrayList<ProductDto> pSearch(String 검색어){
        ArrayList<ProductDto> dtoList = new ArrayList<>();
        try{
            String sql = "select"
        } catch (Exception e) { System.out.println(e); }
    }
}// class end
