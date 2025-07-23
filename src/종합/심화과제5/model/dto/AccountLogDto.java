package 종합.심화과제5.model.dto; // 패키지명

public class AccountLogDto {// class start
    // 멤버변수
    private int logno; // 로그번호
    private String banknump; // 보내는사람
    private String banknumr; // 받는사람
    private String ltime; // 시간
    private String content; // 입출금
    private String transMoney; // 이체금액
    private int nowMoney; // 현재 잔고

    // 생성자 , getter/setter , toString

    public AccountLogDto() {
    }
    public AccountLogDto(int logno, String postbank, String receivebank, String time, String content, String transMoney, int nowMoney) {
        this.logno = logno;
        this.banknump = postbank;
        this.banknumr = receivebank;
        this.ltime = time;
        this.content = content;
        this.transMoney = transMoney;
        this.nowMoney = nowMoney;
    }

    public int getLogno() { return logno; }
    public void setLogno(int logno) { this.logno = logno; }

    public String getPostbank() { return banknump; }
    public void setPostbank(String postbank) { this.banknump = postbank; }

    public String getReceivebank() { return banknumr; }
    public void setReceivebank(String receivebank) { this.banknumr = receivebank; }

    public String getTime() { return ltime; }
    public void setTime(String time) { this.ltime = time; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getTransMoney() { return transMoney; }
    public void setTransMoney(String transMoney) { this.transMoney = transMoney; }

    public int getNowMoney() { return nowMoney; }
    public void setNowMoney(int nowMoney) { this.nowMoney = nowMoney; }

    @Override
    public String toString() {
        return "AccountLogDto{" +
                "logno=" + logno +
                ", postbank='" + banknump + '\'' +
                ", receivebank='" + banknumr + '\'' +
                ", time='" + ltime + '\'' +
                ", content='" + content + '\'' +
                ", transMoney=" + transMoney +
                ", nowMoney=" + nowMoney +
                '}';
    }
}// class end
