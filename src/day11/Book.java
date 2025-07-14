package day11; // 패키지명

public class Book { // class start
    // 멤버변수
    private String title;
    private String author;
    // 생성자
    public Book() { }// 기본 생성자

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }// 생성자 end
    // 메소드

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}// class end
