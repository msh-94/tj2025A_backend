package 종합.과제9.view; // 패키지명

import 종합.과제9.controller.MarketController;
import 종합.과제9.model.Dto.InquiryDto;
import 종합.과제9.model.Dto.ProductDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MarketView { // class start
    // 싱글톤
    private MarketView(){}
    private static final MarketView instance = new MarketView();
    public static MarketView getInstance(){ return instance; }

    // 스캐너
    private Scanner scan = new Scanner(System.in);

    // controller 가져오기
    private MarketController mc = MarketController.getInstance();

    // 메인 뷰
    public void index(){
        for ( ; ; ){
            try{
                System.out.println("-------------------------------------------------------- 뚝딱마켓 --------------------------------------------------------");
                System.out.println("          1. 물품등록  2. 전체물품조회  3. 물품수정  4. 물품삭제  5. 문의  6. 물품상세조회  7. 랭킹  8. 검색");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                System.out.print("선택 > ");
                int choose = scan.nextInt();
                if (choose == 1){ productAdd(); }
                else if (choose == 2){ getProductList(); }
                else if (choose == 3){ productUpdate(); }
                else if (choose == 4){ productDelete(); }
                else if (choose == 5){ inquiryAdd(); }
                else if (choose == 6){ }
                else if (choose == 7){ }
                else if (choose == 8){ }
                else { System.out.println("[경고] 존재하지 않는 번호 입니다"); } //if end
            }catch (InputMismatchException e){
                System.out.println("[경고] 타입이 일치하지 않습니다. ");
                scan = new Scanner(System.in);
            } catch (Exception e) {
                System.out.println("[오류] 관리자에게 문의하세요 [ 010 - 0000 - 0000 ]");
            }// try end
        }// for end
    }// func end

    // 등록뷰
    public void productAdd(){
        System.out.print("닉네임 : ");     String 닉네임 = scan.next();
        System.out.print("비밀번호 : ");    int 비밀번호 = scan.nextInt(); scan.nextLine();
        System.out.print("물품명 : ");     String 물품명 = scan.nextLine();
        System.out.print("가격 : ");      int 가격 = scan.nextInt();    scan.nextLine();
        System.out.print("설명 : ");      String 설명 = scan.nextLine();
        boolean result = mc.productAdd(닉네임,비밀번호,물품명,가격,설명);
        if (result){
            System.out.println("[안내] 등록이 완료되었습니다.");
        }else {
            System.out.println("[경고] 등록이 실패하였습니다.");
        }// if end
    }// func end

    // 전체조회 뷰
    public void getProductList(){
        ArrayList<ProductDto> result = mc.getProductList();
        for (ProductDto dto : result){
            System.out.println("물품번호 \t 물품명 \t 가격 \t 닉네임 \t 등록일 \t 판매여부 ");
            System.out.printf("%d \t %s \t %s \t %s \t %s \t %s \n",dto.get물품번호(),dto.get물품명(),dto.get가격(),
                    dto.get닉네임(),dto.get등록날짜(),dto.get판매여부());
        }// for end
    }// func end

    // 물품 수정 뷰
    public void productUpdate(){
        System.out.print("수정할 물품번호 : ");        int 물품번호 = scan.nextInt();
        System.out.print("비밀번호 : ");            int 비밀번호 = scan.nextInt();  scan.nextLine();
        System.out.print("물품명 수정 : ");          String 물품명 = scan.nextLine();
        System.out.print("가격 수정 : ");           int 가격 = scan.nextInt(); scan.nextLine();
        System.out.print("설명 수정 : ");           String 설명 = scan.nextLine();
        System.out.print("판매여부 수정 : ");         String 판매여부 = scan.next();
        boolean result = mc.productUpdate(물품번호,비밀번호,물품명,가격,설명,판매여부);
        if (result){
            System.out.println("[안내] 수정이 완료되었습니다,");
        }else {
            System.out.println("[경고] 수정이 실패하였습니다.");
        }// if end
    }// func end

    // 물품 삭제 뷰
    public void productDelete(){
        System.out.print("삭제할 물품번호 : ");       int 물품번호 = scan.nextInt();
        System.out.print("비밀번호 : ");            int 비밀번호 = scan.nextInt();
        boolean result = mc.productDelete(물품번호,비밀번호);
        if (result){
            System.out.println("[안내] 삭제가 완료되었습니다.");
        }else {
            System.out.println("[경고] 삭제가 실패하였습니다.");
        }//if end
    }// func end

    // 문의 등록 뷰
    public void inquiryAdd(){
        System.out.print("문의자 닉네임 : ");     String 닉네임 = scan.next();
        System.out.print("문의자 비밀번호 : ");    int 비밀번호 = scan.nextInt();  scan.nextLine();
        System.out.print("문의 내용 : ");       String 내용 = scan.nextLine();
        boolean result = mc.inquiryAdd(닉네임,비밀번호,내용);
        if (result){
            System.out.println("[안내] 문의 등록이 완료되었습니다.");
        }else {
            System.out.println("[경고] 문의 등록이 실패하였습니다.");
        }// if end
    } // func end

    // 특정물품 조회기능 뷰
    public void getProduct(){
        System.out.print("조회할 물품번호 : ");    int 물품번호 = scan.nextInt();
        ProductDto dto = mc.getProduct(물품번호);
        ArrayList<InquiryDto> dtoList = mc.getInquiry(물품번호);
        System.out.println("물품번호 \t 물품명 \t 가격 \t 닉네임 \t 등록일 \t 판매여부");
        System.out.printf("%d \t %s \t %d \t %s \t %s \t %s \n",dto.get물품번호(),dto.get물품명(),dto.get가격(),dto.get닉네임(),
                dto.get등록날짜(),dto.get판매여부());
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("------------------------------- 문의 내역 ------------------------------------------");
        System.out.println("번호 \t 닉네임 \t 내용 \t 등록날짜");
        for (InquiryDto idto : dtoList){
            System.out.printf("%d \t %s \t %s \t %s \n",idto.get문의번호(),idto.getI닉네임(),idto.get문의내용(),idto.get문의날짜());
        }// for end
    }// func end

    // 랭킹 뷰
    public void getRank(){
        System.out.println("********* 랭킹 ********");
        System.out.println("등수 \t 닉네임 \t 등록수");
        int 등수 = 0;
        ArrayList<ProductDto> dtos = mc.getRank();
        for (ProductDto pdto : dtos){
            System.out.printf("%d \t %s \t %d \n",++등수,pdto.get닉네임(),pdto.get가격());
        }// for end
    }// func end
}// class end
