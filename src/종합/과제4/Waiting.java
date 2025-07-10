package 종합.과제4; // 패키지명

public class Waiting { // class start
    // 멤버변수
    private String phone;
    private int count;
    // 생성자
    public Waiting(String phone, int count) {
        this.phone = phone;
        this.count = count;
    } // 생성자 end
    // getter setter

    public String getPhone() {
        return phone;
    } // phone getter end

    public void setPhone(String phone) {
        this.phone = phone;
    }// phone setter end

    public int getCount() {
        return count;
    }// count getter end

    public void setCount(int count) {
        this.count = count;
    }// count setter end

    @Override
    public String toString() {
        return "Waiting{" +
                "phone='" + phone + '\'' +
                ", count=" + count +
                '}';
    }// toString end
} // class end
