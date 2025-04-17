package book;

public class Book {
    // 클래스 변수 - 클래스 모두가 공유하는 특정한 값
    // 인스턴스를 만들지 않아도 클래스로 접근 가능한 값
    static int totalNo;

    // 필드: name, author, no, comment
    String name;
    String author;
    int no;
    String comment;

    // 생성자 - 우리가 아무 생성자도 만들지 않으면 컴파일러가 기본 생성자를 넣어줍니다.
    Book(){
        this("이름없음", "미정", "읽는중"); // 디폴트파라미터의 역할
    }

    Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.comment = "읽는중";
        this.no = ++totalNo;
    }

    Book(String name, String author, String comment) {
        this.name = name;
        this.author = author;
        this.comment = comment;
        this.no = ++totalNo;
    }

    // 메서드: // void introduce  -> 멤버 변수들이 뭐가 있는지 출력
    void introduce(){
        System.out.println(this.name);
        System.out.println(this.author);
        System.out.println(no); // this를 생략해도 컴파일러가 넣어숩니다.
        System.out.println(this.comment);
    }

     void finish(String comment) {  // -> 다 읽었습니다. + comment 출력
         System.out.println("다 읽었습니다");
         this.comment = comment;
         System.out.println(this.comment);
     }
     
    // setBookName -> 책 이름을 간접적으로 접근해서 변경할 수 있습니다.
    void setBookName(String bookName) {
        this.name = bookName;
        System.out.println(this.name + "로 변경함");
    }

    static void getTotalReview(){
        System.out.println(totalNo + "권의 책을 읽었습니다.");
    }

}
