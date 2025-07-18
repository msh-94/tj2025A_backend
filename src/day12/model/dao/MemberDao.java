package day12.model.dao;

import day12.controller.MemberController;
import day12.model.dto.MemberDto;

import java.util.ArrayList;

public class MemberDao {
    // 싱글톤
    private MemberDao(){}
    private static final MemberDao instance = new MemberDao();
    public static MemberDao getInstance(){
        return instance;
    }// 싱글톤 end

    // ArrayList 선언
    ArrayList<MemberDto> memberDtos = new ArrayList<>();

    // 회원가입
    public int signUp(String mid , String mpw , String mname , String mphone){
        MemberDto memberDto = new MemberDto(MemberController.mno+1 , mid , mpw , mname , mphone);
        memberDtos.add(memberDto);
        if (mid.equals("admin")){
            return 2;
        }else { return 0;}
    }// func end

    // 로그인
    public int signIn(String mid , String mpw){
        for (int i = 0; i < memberDtos.size(); i++){
            MemberDto m1 = memberDtos.get(i);
            if (m1.getMid().equals(mid) && m1.getMpw().equals(mpw)){
                return 0;
            } else if (m1.getMid().equals("admin") && m1.getMpw().equals(mpw)) {
                return 2;
            }// if end
        }// for end
        return 1;
    }// func end


    //  memberList 조회 메소드
    public ArrayList<MemberDto> getMemberList(){
        return memberDtos;
    }// func end
}// class end
