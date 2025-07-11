package 종합.과제5.view;// 패키지명

import 종합.과제5.controller.WaitingController;
import 종합.과제5.model.dto.WaitingDto;

import java.util.Scanner;

public class WaitingView { // class start
    // 싱글톤
    private WaitingView(){}
    private static final WaitingView view = new WaitingView();
    public static WaitingView getInstance(){
        return view;
    }// func end
    // 스캐너
    private Scanner scan = new Scanner(System.in);
    // controller 객체가져오기
    private WaitingController wco = WaitingController.getInstance();

    // 화면
    public void screen(){
        for (; ; ){
            System.out.println("=========== 맛집 대기 시스템 =============");
            System.out.println("  1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner(System.in);
            int i1 = scan.nextInt();
            if (i1 == 1){addWait();}
            else if (i1 == 2){getscreen();}
        }// for end
    }// func end

    // 등록
    public void addWait(){
        System.out.print("전화번호 : ");
        String s1 = scan.next();
        System.out.print("인원수 : ");
        int i2 = scan.nextInt();
        boolean result = wco.WaitingWrite(s1,i2);
        if (result){
            System.out.println("[안내] 대기 등록이 완료되었습니다.");
        }else {
            System.out.println("[경고] 대기 등록이 실패하였습니다.");
        }// if end
    }// func end

    // 조회
    public void getscreen(){
        System.out.println("============= 대기 현황 =============");
        WaitingDto[] result = wco.getDto();
        for (int i = 0; i < result.length; i++){
            if (result[i] != null){
                System.out.println("연락처:" +result[i].getPhone()+" - 인원: "+result[i].getCount()+"명");
                System.out.println("------------------------------------");
            }// if end
        }// for end
    }// func end

}// class end
