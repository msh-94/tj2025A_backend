package day12.controller;

import day12.model.dao.MemberDao;
import day12.model.dto.MemberDto;


public class MemberController {
    // 싱글톤
    private MemberController(){}
    private static final MemberController instance = new MemberController();
    public static MemberController getInstance(){
        return instance;
    } // 싱글톤 end

    // dao 가져오기
    private MemberDao memberDao = MemberDao.getInstance();

    // 회원번호 젼역변수 선언
    public static int mno = 0;

    // 회원가입
    public int signUp(String mid , String mpw , String mname , String mphone){
        return memberDao.signUp(mid, mpw, mname, mphone);
    }// func end

    // 로그인
    public int signIn(String mid , String mpw){
        if (memberDao.signIn(mid,mpw) == 0){
            mno = userCheck(mid, mpw).getMno();
        } else if (memberDao.signIn(mid,mpw) == 2) {
            mno = userCheck(mid, mpw).getMno();
        }else { mno = 0;}
        return memberDao.signIn(mid,mpw);
    }// func end

    // 로그아웃
    public int signOut() {
        mno = 0;
        return mno;
    }

    // 정보조회
    public MemberDto userCheck(String mid , String mpw){
        for(int i = 0 ; i < memberDao.getMemberList().size() ; i++ ){
            MemberDto b1 = memberDao.getMemberList().get(i);
            if(b1.getMid().equals(mid) && b1.getMpw().equals(mpw)){
                return memberDao.getMemberList().get(i);
            }// if end
        }// for end
        return null;
    }// func end
}// class end
