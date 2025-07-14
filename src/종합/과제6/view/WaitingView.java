package 종합.과제6.view; // 패키지명

import 종합.과제4.Waiting;
import 종합.과제6.controller.WaitingController;
import 종합.과제6.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView { // class start
    // 싱글톤
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();

    public static WaitingView getInstance() {
        return instance;
    }// 싱글톤 end
    // controller 가져오기
    WaitingController waitingController = WaitingController.getInstance();
    // 스캐너
    Scanner scan = new Scanner(System.in);
    // 처음 화면
    public void screen(){
        for ( ; ; ){
            System.out.println("=========== 맛집 대기 시스템 =============");
            System.out.println("  1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 > ");
            int i1 = scan.nextInt();
            if (i1 == 1){ addWaiting(); }
            else if (i1 == 2){ getWaitingList(); }
        }// for end
    }// func end

    // 등록
    public void addWaiting(){
        System.out.print("전화번호 : ");
        String phone = scan.next();
        System.out.print("인원수 : ");
        int count = scan.nextInt();
        boolean result = waitingController.addWaiting(phone,count);
        if (result){ System.out.println("[안내] 대기 등록이 완료되었습니다"); }
        else { System.out.println("[경고] 대기 등록이 실패하였습니다"); }
    }// func end

    // 전체조회
    public void getWaitingList(){
        System.out.println("============= 대기 현황 =============");
        ArrayList<WaitingDto> result = waitingController.getWaitingList();
        for (int i = 0; i < result.size(); i++){
            WaitingDto waitingDto = result.get(i);
            System.out.printf("연락처 : %s - 인원 : %d\n",waitingDto.getPhone(),waitingDto.getCount());
            System.out.println("------------------------------------");
        } // for end
    }// func end

}// class end
