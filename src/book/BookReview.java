package book;

public class BookReview {
    public static void main(String[] args){
        Book book1 = new Book(); // 아무 값도 넣지 않고 book 객체를 만들면
        book1.introduce();
        System.out.println("--------------------------------");
        Book book2 = new Book("기나긴 이별", "레이먼드 챈들러");// 책이름, 작가명을 입력받고 싶어요.
        book2.introduce();
        book2.finish("와 필립말로 내 이상형...");
        book2.introduce();
        book2.setBookName("빅 슬립");
        System.out.println("--------------------------------");
        book2.introduce();
        System.out.println("--------------------------------");
        Book.getTotalReview(); // 클래스 메서드 사용
    }
}
