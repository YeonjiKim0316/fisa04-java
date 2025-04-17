package book;

//# ComicBook 이라는 부모클래스를 상속받은 자식클래스
//# 필드: star (별점을 매기는 속성 추가)
//# 메서드: introduce에 기존 동작 + 별점도 함께 출력
//# getBookStar -> 책의 별점을 간접적으로 확인하는 메서드 만들어주십시오.
public class ComicBook extends Book {
    // 생성자에 인수를 입력받으려면 추가해서 사용합니다.
    int star;

    ComicBook(String name, String author){
//        this.name = name;
//        this.author = author;
        super(name, author); // 부모 클래스의 생성자에게 넘겨줌
    };

    ComicBook(String name, String author, int star){
//        this.name = name;
//        this.author = author;
        super(name, author); // 부모 클래스의 생성자에게 넘겨줌
        this.star = star;
    };

    // 부모클래스의 특정 메서드를 자식클래스에서 변경해서 사용
    @Override // 부모에게 이 메서드가 있는지 확인하고
    void introduce(){
        super.introduce(); // 부모클래스의 메서드 동작
        System.out.println(this.star); //
    }

    void getBookStar(){
        System.out.println(this.star);
    }
}
