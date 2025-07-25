package 종합.과제9.controller; // 패키지명

import 종합.과제9.model.Dao.InquiryDao;
import 종합.과제9.model.Dao.ProductDao;
import 종합.과제9.model.Dto.InquiryDto;
import 종합.과제9.model.Dto.ProductDto;

import java.util.ArrayList;

public class MarketController { // class start
    // 싱글톤
    private MarketController(){}
    private static final MarketController instance = new MarketController();
    public static MarketController getInstance(){ return instance; }

    // dao 가져오기
    private ProductDao productDao = ProductDao.getInstance();
    private InquiryDao inquiryDao = InquiryDao.getInstance();

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

    // 물품 삭제 기능
    public boolean productDelete(int 물품번호, int 비밀번호){
        ProductDto dto = new ProductDto(물품번호,null,비밀번호,null,0,null,null,null);
        boolean result = productDao.productDelete(dto);
        return result;
    }// func end

    // 문의등록 기능
    public boolean inquiryAdd(String 닉네임 , int 비밀번호 ,String 내용){
        InquiryDto dto = new InquiryDto(0,0,닉네임,비밀번호,내용,null);
        boolean result = inquiryDao.inquiryAdd(dto);
        return result;
    }// func end

    // 특정물품 조회 기능
    public ProductDto getProduct(int 물품번호){
        ProductDto dto = productDao.getProduct(물품번호);
        return dto;
    }// func end

    // 특정물품 문의내역 조회
    public ArrayList<InquiryDto> getInquiry(int 물품번호){
        ArrayList<InquiryDto> result = inquiryDao.getInquiry(물품번호);
        return result;
    }// func end

    // 랭킹조회 기능
    public ArrayList<ProductDto> getRank(){
        ArrayList<ProductDto> result = productDao.getRank();
        return result;
    }// func end
}// class end
