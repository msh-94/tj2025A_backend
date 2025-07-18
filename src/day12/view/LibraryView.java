package day12.view;

import day12.controller.BookController;
import day12.controller.LogController;
import day12.controller.MemberController;
import day12.model.dao.MemberDao;
import day12.model.dto.MemberDto;

import java.util.Scanner;

public class LibraryView {
    // 싱글톤
    private LibraryView(){}
    private static final LibraryView instance = new LibraryView();
    public static LibraryView getInstance(){
        return instance;
    }// 싱글톤 end

    // controller 가져오기
    private MemberController memberController = MemberController.getInstance();
    private BookController bookController = BookController.getInstance();
    private LogController logController = LogController.getInstance();

    // 스캐너
    private Scanner scan = new Scanner(System.in);

    // 초기화면
    public void index(){
        for ( ; ; ){
            System.out.println("=========== 도서관리 시스템  ===========");
            System.out.println("  1.회원가입 | 2.로그인");
            System.out.println("==========================================");
            System.out.print("선택 > ");
            int i1 = scan.nextInt();
            if (i1 == 1){ signUp(); }
            else if (i1 == 2){ signIn(); }
        }// for end
    }// func end

    // 회원가입
    public void signUp() {
        System.out.println("--- 회원 가입 ---");
        System.out.print("아이디 : ");
        String mid = scan.next();
        System.out.print("비밀번호 : ");
        String mpw = scan.next();
        System.out.print("이름 : ");
        String mname = scan.next();
        System.out.print("연락처 : ");
        String mphone = scan.next();


        int result = memberController.signUp(mid, mpw, mname, mphone);
        if (result == 0) System.out.println("[안내] 회원가입이 완료되었습니다.");
        else if (result == 1) System.out.println("[경고] 회원가입에 실패하였습니다.");
        else if (result == 2) System.out.println("[안내] 관리자 계정이 등록되었습니다.");
    }// func end

    // 로그인
    public void signIn() {
        System.out.println("--- 로그인 ---");
        System.out.print("아이디 : ");
        String mid = scan.next();
        System.out.print("비밀번호 : ");
        String mpw = scan.next();

        int result = memberController.signIn(mid, mpw);

        if (result == 0) {
            MemberDto member = memberController.userCheck(mid,mpw);
            System.out.println("[안내] " + member.getMname() + "님, 환영합니다.");
            userMenu();
        } else if (result == 1) {
            System.out.println("[경고] 계정 정보가 일치하지 않습니다.");
        } else if (result == 2) {
            MemberDto member = memberController.userCheck(mid,mpw);
            System.out.println("[안내] " + member.getMname() +"님, 환영합니다.");
            adminMenu();
        }// if end
    }// func end

    // 유저메뉴
    public void userMenu() {
        //for (;;) {
        //    System.out.println("=========== 도서관리 시스템 ===========");
        //    System.out.println("  1.도서대출 | 2.도서반납 | 3.내대출현황 | 4.도서목록 | 5.로그아웃");
        //    System.out.println("================================================================");
        //    System.out.print("선택 > ");
        //    int num = scan.nextInt();
        //    scan.nextLine();
        //
        //    if (num == 1) borrowBook();
        //    else if (num == 2) returnBook();
        //    else if (num == 3) logCheck();
        //    else if (num == 4) bookCheck();
        //    else if (num == 5) signOut();
        //    else System.out.println("[경고] 해당 메뉴는 관리자만 접근 가능합니다.");
        //}// for end
    }// func end

    // 관리자 메뉴
    public void adminMenu() {
        //for (;;) {
        //    System.out.println("=========== 도서관리 시스템 ===========");
        //    System.out.println("  1.도서등록 | 2.도서대출 | 3.도서반납 | 4.내대출현황 | 5.도서목록 | 6.로그아웃");
        //    System.out.println("================================================================");
        //    System.out.print("선택 > ");
        //    int num = scan.nextInt();
        //    scan.nextLine();
        //
        //    if (num == 1) addBook();
        //    else if (num == 2) borrowBook();
        //    else if (num == 3) returnBook();
        //    else if (num == 4) logCheck();
        //    else if (num == 5) bookCheck();
        //    else if (num == 6) signOut();
        //    else System.out.println("[경고] 존재하지 않는 메뉴입니다.");
        //}// for end
    }// func end
}// class end
