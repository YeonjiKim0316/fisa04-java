package book;

public class BookReview {
    public static void main(String[] args){
//        Book book1 = new Book(); // 아무 값도 넣지 않고 book 객체를 만들면
//        book1.introduce();
//        System.out.println("--------------------------------");
//        Book book2 = new Book("기나긴 이별", "레이먼드 챈들러");// 책이름, 작가명을 입력받고 싶어요.
//        book2.introduce();
//        book2.finish("와 필립말로 내 이상형...");
//        book2.introduce();
//        book2.setBookName("빅 슬립");
//        System.out.println("--------------------------------");
//        book2.introduce();
//        System.out.println("--------------------------------");
//        Book.getTotalReview(); // 클래스 메서드 사용

//        ComicBook comic1 = new ComicBook("체인소맨", "후지모토 타츠키");
//        comic1.introduce();
//        System.out.println(comic1.star);
        System.out.println("-------------------");
        ComicBook comic2 = new ComicBook("안녕 에리", "후지모토 타츠키", 5);
        comic2.getBookStar(); // 자식클래스의 인스턴스는 사용할 수 있지만
        Book book2 = new Book("기나긴 이별", "레이먼드 챈들러");
        // 부모 클래스에는 없는 인스턴스 메서드
        
    }
}
