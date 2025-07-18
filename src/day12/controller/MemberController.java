package day12.controller;

public class MemberController {
    private MemberController(){}
    private static final MemberController instance = new MemberController();
    public static MemberController getInstance(){
        return instance;
    }
}// class end
