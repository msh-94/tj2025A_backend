package 종합.심화과제5.model.dto; // 패키지명

public class AccountLog {// class start
    // 멤버변수
    private String time;
    private String content;
    private String transMoney;
    private int nowMoney;

    // 생성자 , getter/setter , toString
    public AccountLog() {
    }
    public AccountLog(String time, String content, String transMoney, int nowMoney) {
        this.time = time;
        this.content = content;
        this.transMoney = transMoney;
        this.nowMoney = nowMoney;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getTransMoney() {
        return transMoney;
    }
    public void setTransMoney(String transMoney) {
        this.transMoney = transMoney;
    }
    public int getNowMoney() {
        return nowMoney;
    }
    public void setNowMoney(int nowMoney) {
        this.nowMoney = nowMoney;
    }

    @Override
    public String toString() {
        return "AccountLog{" +
                "time='" + time + '\'' +
                ", content='" + content + '\'' +
                ", transMoney='" + transMoney + '\'' +
                ", nowMoney=" + nowMoney +
                '}';
    }
}// class end
