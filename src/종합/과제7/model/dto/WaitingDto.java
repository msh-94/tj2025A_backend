package 종합.과제7.model.dto; // 패키지명

public class WaitingDto {// class start
    // 매개변수
    private String Phone;
    private int count;

    // 생성자 getter/setter/toString
    public WaitingDto() {
    }
    public WaitingDto(String phone, int count) {
        Phone = phone;
        this.count = count;
    }

    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {
        Phone = phone;
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
                "Phone='" + Phone + '\'' +
                ", count=" + count +
                '}';
    }
}// class end
