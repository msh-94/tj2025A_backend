package 종합.심화과제5.view;// 패키지명

import 종합.심화과제5.controller.BankController;

import java.util.Scanner;

public class BankView { // class start
    // 싱글톤
    private BankView(){}
    private static final BankView instance = new BankView();
    public static BankView getInstance(){ return instance; }

    // controller 가져오기
    private BankController bankController = BankController.getInstance();

    // Scanner
    Scanner scan = new Scanner(System.in);
}// class end
