package 종합.과제9.controller; // 패키지명

import 종합.과제9.model.Dao.ProductDao;
import 종합.과제9.model.Dto.ProductDto;

import java.util.ArrayList;

public class MarketController { // class start
    // 싱글톤
    private MarketController(){}
    private static final MarketController instance = new MarketController();
    public static MarketController getInstance(){ return instance; }

    // dao 가져오기
    private ProductDao productDao = ProductDao.getInstance();

    // 물품등록기능
    public boolean productAdd(String 닉네임,int 비밀번호,String 물품명 ,int 가격 ,String 설명){
        ProductDto dto = new ProductDto(0,닉네임,비밀번호,물품명,가격,설명,null,null);
        boolean result = productDao.productAdd(dto);
        return result;
    }// func end

    // 물품 전체조회 기능
    public ArrayList<ProductDto> getProductList(){
        ArrayList<ProductDto> result = productDao.getProductList();
        return result;
    }// func end

    // 물품 수정 기능
    public boolean productUpdate(int 물품번호,int 비밀번호,String 물품명,int 가격 ,String 설명,String 판매여부){
        ProductDto dto = new ProductDto(물품번호,null,비밀번호,물품명,가격,설명,판매여부,null);
        boolean result = productDao.productUpdate(dto);
        return result;
    }// func end
}// class end
