package 종합.과제8.view;// 패키지명

import 종합.과제8.controller.WaitingController;
import 종합.과제8.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WaitingView {// class start
    // 싱글톤
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance(){return instance; }

    // controller 가져오기
    private WaitingController waitingController = WaitingController.getInstance();

    // Scanner
    private Scanner scan = new Scanner(System.in);

    // 메인 뷰
    public void index(){
        for ( ; ; ){
            try {
                System.out.println("=================== 맛집 대기 시스템 ==================");
                System.out.println("1.대기 등록 | 2.대기 현황 | 3.대기 삭제 | 4.대기 수정 ");
                System.out.println("=====================================================");
                System.out.print("선택 > ");
                int i1 = scan.nextInt();
                if (i1 == 1) { waitAdd(); }
                else if (i1 == 2) { waitPrint(); }
                else if (i1 == 3) { waitDelete(); }
                else if (i1 == 4) { waitUpdate(); }
                else { System.out.println("[경고] 존재하지 않는 번호입니다."); } // if end
            }catch (InputMismatchException e){
                System.out.println("[경고] 입력타입이 일치하지 않습니다.");
                scan = new Scanner(System.in);
            }catch (Exception e){
                System.out.println("[오류] 관리자에게 문의하세요 < 010-0000-0000 >");
            }// try end
        }// foe end
    }// func end

    // 등록뷰
    public void waitAdd(){
        System.out.print("전화번호 : ");
        String phone = scan.next();
        System.out.print("인원수 : ");
        int count = scan.nextInt();
        if (waitingController.waitAdd(phone,count)){
            System.out.println("[안내] 대기 등록이 안료되었습니다.");
        }else {
            System.out.println("[경고] 대기 등록이 실패하였습니다.");
        }// if end
    }// func end

    // 전체조회뷰
    public void waitPrint(){
        System.out.println("============= 대기 현황 =============");
        ArrayList<WaitingDto> result = waitingController.waitPrint();
        for ( WaitingDto dto : result){
            System.out.printf("대기번호 : %d 연락처 : %s - 인원 %d명\n",dto.getWno(), dto.getPhone() , dto.getCount());
            System.out.println("------------------------------------");
        }// for end
    }// func end

    // 대기삭제 뷰
    public void waitDelete(){
        System.out.print("삭제할 대기번호 : ");
        int wno = scan.nextInt();
        boolean result = waitingController.waitDelete(wno);
        if (result){
            System.out.println("[안내] 대기 삭제 되었습니다.");
        }else {
            System.out.println("[경고] 없는 번호 이거나 대기 삭제가 실패하였습니다");
        }// if end
    }// func end

    // 대기인원 수정 뷰
    public void waitUpdate(){
        System.out.print("수정할 대기번호 : ");    int wno = scan.nextInt();
        System.out.print("수정할 인원 : ");      int count = scan.nextInt();
        boolean result = waitingController.waitUpdate(wno,count);
        if (result){
            System.out.println("[안내] 수정이 완료 되었습니다");
        }else {
            System.out.println("[경고] 없는 번호 이거나 수정이 실패하였습니다.");
        }// if end
    }// func end
}// class end
