package 종합.과제6.model.dto; // 패키지명

public class WaitingDto { // calss start
    // 1. 멤버변수
    private String phone;
    private int count;
// 2. 생성자
    // 1) 기본생성자
    public WaitingDto() {}
    // 2) 전체생성자
    public WaitingDto(String phone, int count) {
        this.phone = phone;
        this.count = count;
    }
// 3. 메소드
    // 1) setter
    // 2) getter
    // 3) toString

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "WaitingDto{" +
                "phone='" + phone + '\'' +
                ", count=" + count +
                '}';
    }
}// class end
