package 종합.과제9.model.Dto; // 패키지명

public class InquiryDto { // class start
    // 멤버변수
    private int 문의번호;
    private int i물품번호;
    private String i닉네임;
    private int i비밀번호;
    private String 문의내용;
    private String 문의날짜;
    // 생성자 , getter/setter , toString
    public InquiryDto() {
    }
    public InquiryDto(int 문의번호, int i물품번호, String i닉네임, int i비밀번호, String 문의내용, String 문의날짜) {
        this.문의번호 = 문의번호;
        this.i물품번호 = i물품번호;
        this.i닉네임 = i닉네임;
        this.i비밀번호 = i비밀번호;
        this.문의내용 = 문의내용;
        this.문의날짜 = 문의날짜;
    }

    public int get문의번호() { return 문의번호; }
    public void set문의번호(int 문의번호) { this.문의번호 = 문의번호; }

    public int getI물품번호() { return i물품번호; }
    public void setI물품번호(int i물품번호) { this.i물품번호 = i물품번호; }

    public String getI닉네임() { return i닉네임; }
    public void setI닉네임(String i닉네임) { this.i닉네임 = i닉네임; }

    public int getI비밀번호() { return i비밀번호; }
    public void setI비밀번호(int i비밀번호) { this.i비밀번호 = i비밀번호; }

    public String get문의내용() { return 문의내용; }
    public void set문의내용(String 문의내용) { this.문의내용 = 문의내용; }

    public String get문의날짜() { return 문의날짜; }
    public void set문의날짜(String 문의날짜) { this.문의날짜 = 문의날짜; }

    @Override
    public String toString() {
        return "InquiryDto{" +
                "문의번호=" + 문의번호 +
                ", i물품번호=" + i물품번호 +
                ", i닉네임='" + i닉네임 + '\'' +
                ", i비밀번호=" + i비밀번호 +
                ", 문의내용='" + 문의내용 + '\'' +
                ", 문의날짜='" + 문의날짜 + '\'' +
                '}';
    }
}// class end
