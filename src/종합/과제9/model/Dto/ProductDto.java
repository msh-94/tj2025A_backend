package 종합.과제9.model.Dto; // 패키지명

public class ProductDto { // class start
    // 멤버변수
    private int 물품번호;
    private String 닉네임;
    private int 비밀번호;
    private String 물품명;
    private int 가격;
    private String 설명;
    private String 판매여부;
    private String 등록날짜;
    // 생성자 , getter/setter , toString
    public ProductDto() {
    }
    public ProductDto(int 물품번호, String 닉네임, int 비밀번호, String 물품명, int 가격, String 설명, String 판매여부, String 등록날짜) {
        this.물품번호 = 물품번호;
        this.닉네임 = 닉네임;
        this.비밀번호 = 비밀번호;
        this.물품명 = 물품명;
        this.가격 = 가격;
        this.설명 = 설명;
        this.판매여부 = 판매여부;
        this.등록날짜 = 등록날짜;
    }

    public int get물품번호() { return 물품번호; }
    public void set물품번호(int 물품번호) { this.물품번호 = 물품번호; }

    public String get닉네임() { return 닉네임; }
    public void set닉네임(String 닉네임) { this.닉네임 = 닉네임; }

    public int get비밀번호() { return 비밀번호; }
    public void set비밀번호(int 비밀번호) { this.비밀번호 = 비밀번호; }

    public String get물품명() { return 물품명; }
    public void set물품명(String 물품명) { this.물품명 = 물품명; }

    public int get가격() { return 가격; }
    public void set가격(int 가격) { this.가격 = 가격; }

    public String get설명() { return 설명; }
    public void set설명(String 설명) { this.설명 = 설명; }

    public String get판매여부() { return 판매여부; }
    public void set판매여부(String 판매여부) { this.판매여부 = 판매여부; }

    public String get등록날짜() { return 등록날짜; }
    public void set등록날짜(String 등록날짜) { this.등록날짜 = 등록날짜; }

    @Override
    public String toString() {
        return "ProductDto{" +
                "물품번호=" + 물품번호 +
                ", 닉네임='" + 닉네임 + '\'' +
                ", 비밀번호=" + 비밀번호 +
                ", 물품명='" + 물품명 + '\'' +
                ", 가격=" + 가격 +
                ", 설명='" + 설명 + '\'' +
                ", 판매여부='" + 판매여부 + '\'' +
                ", 등록날짜='" + 등록날짜 + '\'' +
                '}';
    }
}// class end
