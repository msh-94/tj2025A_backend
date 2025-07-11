package 종합.과제5.model.dto; // 패키지명

public class WaitingDto { // class start
    private String phone;
    private int count;

    public WaitingDto() {} // 기본생성자

    public WaitingDto(String phone, int count) {
        this.phone = phone;
        this.count = count;
    }// 풀생성자
    // getter setter toString
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
