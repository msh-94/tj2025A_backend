package 종합.과제7.view; // 패키지명


import 종합.과제7.controller.WaitingController;
import 종합.과제7.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView { // class start
    // 싱글톤
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance(){
        return instance;
    }

    // controller 가져오기
    private WaitingController waitingController = WaitingController.getInstance();

    // Scanner
    Scanner scan = new Scanner(System.in);

    // 메인뷰
    public void index(){
        for ( ; ; ){
            System.out.println("=========== 맛집 대기 시스템 =============");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 > ");
            int i1 = scan.nextInt();
            if (i1 == 1){ waitAdd(); }
            if (i1 == 2){ waitPrint(); }
        }// for end
    }// func end

    // 등록뷰
    public void waitAdd(){
        System.out.print("전화번호 : ");
        String phone = scan.next();
        System.out.print("인원수 : ");
        int count = scan.nextInt();
        if (waitingController.waitAdd(phone,count)){
            System.out.println("[안내] 대기 등록이 완료되었습니다.");
        }else{
            System.out.println("[경고] 대기 등록이 실패하였습니다.");
        }// if end
    }// func end

    // 전체조회 뷰
    public void waitPrint(){
        System.out.println("============= 대기 현황 =============");
        ArrayList<WaitingDto> result = waitingController.waitPrint();
        for ( WaitingDto dto : result){
            System.out.printf("연락처 : %s - 인원 : %d명\n" , dto.getPhone() ,dto.getCount());
            System.out.println("------------------------------------");
        }// for end
    }// func end
}// class end
