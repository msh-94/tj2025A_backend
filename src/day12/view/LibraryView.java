package day12.view;

public class LibraryView {
    private LibraryView(){}
    private static final LibraryView instance = new LibraryView();
    public static LibraryView getInstance(){
        return instance;
    }
}// class end
