package 종합.예제6; // 패키지명
// (1) 데이터 모델 : 게시물 모델링 ,
public class Board {// class start
    // 1. 멤버변수 : *관례적* 멤버변수는 private * 모델명에 들어갈 속성
    // * 모델링에 들어갈 속성
    private String content;
    private String writer;
    // 2. 생성자 : *관례적* 기본생성자1개 와 전체매개변수 갖는 생성자
    // 자동 : 해당 클래스에서 오른쪽 클릭 -> [생성] -> [생성자] -> 모든 멤버변수 복수선택(ctrl)후 -> [확인]
    // 1) 기본생성자
    public Board(){

    }// 기본생성자 end
    public Board(String content, String writer) {// 매개변수 생성자
        this.content = content;
        this.writer = writer;
    }// 매개변수 생성자 end

    // 3. 메소드 :
    // 1) private 으로 선언된 멤버변수를 외부로부터 접근할수 있도록 getter/setter 지원한다
    // 자동 : 해당 클레스에서 오른쪽 클릭 -> [생성] -> [getter 및 setter] -> 모든 멤버변수 복수선택(ctrl)후 -> [확인]


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    // 2) 개발자가 작업하면서 객체의 주소값이 아닌 객체내 멤버변수 값 문자열로 반환 , toString() 지원한다
    // 자동 : 해당 클레스에서 오른쪽 클릭 -> [생성] -> [toString] -> 모든 멤버변수 복수선택(ctrl)후 -> [확인]
    @Override
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
} // class end
